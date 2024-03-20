class TodoModel { //Se encargara del manejo de datos y logica de negocio
  constructor() {
    console.log('Todo Model');

    this.todos = [
      {id: 1, text: 'Desayunar', complete: false},
      {id: 2, text: 'Ir al gimnasio', complete: false},
    ];
  }

  bindTodoListChanged(callback) {
    this.onTodoListChanged = callback;
  }

  addTodo(todoText) {
    const todo = {
      id: (this.todos.length > 0) ? this.todos[this.todos.length - 1].id + 1 : 1,
      text: todoText,
      complete: false,
    };

    this.todos.push(todo);
    console.log(this.todos);

    this.onTodoListChanged(this.todos);
  }

  editTodo(id, updatedText) {
    this.todos = this.todos.map(function(todo) {
      if (todo.id === id) {
        todo = {
          id: todo.id,
          text: updatedText,
          complete: todo.complete,
        };
      } 

      return todo;
    });
  }

  deleteTodo(id) {
    this.todos = this.todos.filter(function(todo) {
      return todo.id !== id;
    })
  }

  toggleTodo(id) {
    this.todos = this.todos.map(function(todo) {
       if (todo.id === id) {
        todo = {
          id: todo.id,
          text: todo.text,
          complete: !todo.complete
        }
       }
       
      return todo;
    });
  }
}