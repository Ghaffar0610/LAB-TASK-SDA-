const express = require('express');
const sql = require('mssql');

const app = express();
const PORT = 3000;

const config = {
  user: 'user',
  password: 'admin',
  server: 'localhost',
  database: 'architecture',
  options: {
    encrypt: false, 
    enableArithAbort: true,
  },
};

tsql.connect(config).then(() => console.log('Connected to MSSQL')).catch(err => console.log('Database connection failed:', err));

app.get('/seed', async (req, res) => {
  try {
    const pool = await sql.connect(config);
    await pool.request().query(`INSERT INTO Products (name, price) VALUES 
      ('Laptop', 1000), 
      ('Phone', 500), 
      ('Tablet', 300)`);
    res.send('Database seeded');
  } catch (error) {
    res.status(500).send('Error seeding database: ' + error);
  }
});

app.get('/search', async (req, res) => {
  const query = req.query.name;
  try {
    const pool = await sql.connect(config);
    const results = await pool.request()
      .input('name', sql.VarChar, `%${query}%`)
      .query('SELECT * FROM Products WHERE name LIKE @name');
    res.json(results.recordset);
  } catch (error) {
    res.status(500).send('Error performing search: ' + error);
  }
});

app.get('/add-index', async (req, res) => {
  try {
    const pool = await sql.connect(config);
    await pool.request().query('CREATE INDEX idx_name ON Products(name)');
    res.send('Index added');
  } catch (error) {
    res.status(500).send('Error creating index: ' + error);
  }
});

app.listen(PORT, () => console.log(`Server running on http://localhost:${PORT}`));