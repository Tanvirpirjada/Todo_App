# Todo_App
 This is java and springboot Based project.In this project we design todo App.In this project we gonna performe crud operations(Create todo,update todo, Deletetodo, Gettodo).
 
 # Data flow
 
 * Request from postman come to the controller class and based on end points and Anootations methods in Cotroller class is called. In cotroller class we Autowired Service class obj.
 So we can write buisness logic in service class and call from controller.

# service
 from controller class the methods of service class is called by contoller class methods. in service class we normally write logic but we are use JPA repositories inbuild methods for create.get.update and delete user.
 
 # Repository
  In repository interface its exctends JPA repository. And we autrowired it in service class and used its inbuild methods.
  
  
  # Data structure and DataBase used in project
  * List
  * H2 Database
  
  # Request Methods With endpoints
  
  GEt Todo-> http: //localhost:8081/findAll
  
  
  Create Todo->http: //localhost:8081/addtodo
  
  
  Update Todo->http: //localhost:8081/UpdateTodo/{id}
  
  
  Delete Todo->http: //localhost:8081/DeleteTodo/{id}
  
