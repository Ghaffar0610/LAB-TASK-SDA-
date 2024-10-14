Social Networking App - UML Diagrams Assignment
This repository contains the UML diagrams for a Social Networking App. The diagrams illustrate key functionalities, object interactions, and system behavior in different use cases, such as User Profile Management, Post Creation, and Messaging. This assignment includes Class, System Sequence, and Communication diagrams.

Diagrams Included
1. Class Diagram
The class diagram defines the structure of the system, showing the classes and their relationships. It models the core entities such as User, Post, Comment, Message, and Admin.

Key Entities:
User: Can create posts, send messages, and update their profile.
Post: Represents content created by users, which can be liked and shared.
Comment: A response to a post.
Message: Handles communication between users.
Admin: Manages users and posts.
UML Code Example:
plaintext
Copy code
class User {
  - int userId
  - String name
  - String email
  + register()
  + login()
  + createPost()
}

class Post {
  - int postId
  - String content
  - Date postDate
  + likePost()
}
Full UML Code for Class Diagram

2. System Sequence Diagram
The system sequence diagram models interactions between external actors (like User) and the system, describing the flow of actions in a use case like "User Creating a Profile" or "User Sending a Message".

Example Sequence:
A user opens the "Create Profile" page.
The system displays the registration form.
After entering the details, the system validates the information.
If valid, the system creates the profile.
UML Code Example:
plaintext
Copy code
User -> SocialNetworkingApp: Open "Create Profile" Page
SocialNetworkingApp --> User: Display Registration Form
User -> SocialNetworkingApp: Enter User Information
Full UML Code for Sequence Diagram

3. Communication Diagram
The communication diagram shows how objects interact in the process of creating a post. It highlights the communication between the User, PostService, Database, and NotificationService.

Example Communication:
The User sends a post creation request.
The PostService saves the post in the Database.
The PostService triggers notifications for the user's followers via the NotificationService.
UML Code Example:
plaintext
Copy code
User -> PostService : createPost(content)
PostService -> DB : savePost(post)
PostService -> NotificationService : notifyFollowers(post)
