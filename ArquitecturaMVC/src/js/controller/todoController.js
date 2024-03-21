class TodoController { //Comunica el modelo y la vista
   constructor(model, view) {
     console.log('Todo Controller');
     this.model = model;
     this.view = view;
     console.log(this);
 
     this.model.bindTodoListChanged(this.onTodoListChanged);
     this.view.bindAddTodo(this.handleAddTodo);
     this.view.bindEditTodo(this.handleEditTodo);
     this.view.bindDeleteTodo(this.handleDeleteTodo);
     this.view.bindToggleTodo(this.handleToggleTodo);
 
    
     this.onTodoListChanged(this.model.todos);
   }
   
   onTodoListChanged = (todos) => {
     this.view.displayTodos(todos);
   }
 
   handleAddTodo = (todoText) => {
     console.log(this);
     this.model.addTodo(todoText);
   }
 
   handleEditTodo = (id, todoText) => {
     this.model.editTodo(id, todoText);
   }
 
   handleDeleteTodo = (id) => {
     this.model.deleteTodo(id);
   }
 
   handleToggleTodo = (id) => {
     this.model.toggleTodo(id);
   }
 };
  