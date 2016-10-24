###Controllers 
 All the classes are annotated with @Controller and @RestController so that they can be scanned by spring MVC
 -	Navigation.java :  Contains MVC controller methods for basic navigation.
 -	RC_Blog : Contains RestWebServices related to Blog.
 -	RC_Forum : Contains RestWebServices related to Forum.
 -	RC_ForumComments : Contains RestWebServices related to ForumComments.
 -	RC_BlogRating : Contains RestWebServices related to BlogRating.
 -	RC_Users : Contains RestWebServices related to Users.
 
 ###Models
 Contains all model classes.These models will be scanned by hibernate, so as to facilitate easy data manipulation using Hibernate ORM.
 -   Blog.java
 -   BlogRating.java
 -   Forum.java
 -   ForumComments.java
 -   User.java
 -   Message.java
 -   OutputMessage.java         	
 
 ###DAO 
 Contains all DAO interfaces and DAOImpls containing RAW persistence Logic. 
 - BlogRatingDAO.java
 - BlogRatingDAOImpl.java
 - BlogDAO.java
 - BlogDAOImpl.java
 - ForumDAO.java
 - ForumDAOImpl.java
 - ForumCommentsDAO.java
 - ForumCommentsDAOImpl.java
 - UsersDAO.java
 - UsersDAOImpl.java
 
 ###Service
 Contains all service interfaces with are accessed from Controllers and ServiceImpl containing business logic.
 - BlogRatingService.java
 - BlogRatingServiceImpl.java
 - BlogService.java
 - BlogServiceImpl.java
 - ForumService.java
 - ForumServiceImpl.java
 - ForumCommentsService.java
 - ForumCommentsServiceImpl.java
 - UsersService.java
 - UsersServiceImpl.java