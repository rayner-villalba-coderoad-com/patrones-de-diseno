class TodoController { //Comunica el modelo y la vista
  constructor(model, view) {
    console.log('Todo Controller');
    this.model = model;
    this.view = view;
   
    this.onTodoListChanged(this.model.todos);
    

  }
  
  onTodoListChanged(todos) {
    this.view.displayTodos(todos);
  }

  handleAddTodo(todoText) {
    this.model.addTodo(todoText);
  }

  handleEditTodo(id, todoText) {
    this.model.editTodo(id, todoText);
  }

  handleDeleteTodo(id) {
    this.model.deleteTodo(id);
  }

  handleToggleTodo(id) {
    this.model.toggleTodo(id);
  }
};
 