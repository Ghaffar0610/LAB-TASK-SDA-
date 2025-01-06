public class main {
    public static void main(String[] args) {
        UserView view = new UserView();
        userController controller = new userController(view);
        controller.start();
    }
}
