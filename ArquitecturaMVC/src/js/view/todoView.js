class TodoView { //TODO lo que el usuario ve 
  constructor() {
    console.log('Todo View');

    //The root element
    this.app = this.getElement('#root');

    //Create title
    this.title = this.createElement('h1');
    this.title.textContent = 'Todos';
    

    //Create form 
    this.form = this.createElement('form');

    this.input = this.createElement('input');
    this.input.type = 'text';
    this.input.placeholder = 'Agregar Tarea';
    this.input.name = 'todo';

    //Create submit button
    this.submitButton = this.createElement('button');
    this.submitButton.textContent = 'Agregar';

    this.todoList = this.createElement('ul', 'todo-list');

    this.form.append(this.input, this.submitButton);


    //Append the title
    this.app.append(this.title, this.form, this.todoList);


    this._temporaryTodoText = '';
    this._initLocalListeners();
  }

  _initLocalListeners() {
    this.todoList.addEventListener('input', (event) => {
      if (event.target.className === 'editable') {
        this._temporaryTodoText = event.target.innerText;
      }
    })
  }

  //Create element with or without CSS class
  createElement(tag, className) {
    const element = document.createElement(tag);
    
    if (className) {
      element.classList.add(className);
    }

    return element;
  }

  //Retrieve an element from the DOM
  getElement(selector) {
    const element = document.querySelector(selector);

    return element;
  }

  get _todoText() {
    return this.input.value;
  }

  _resetInput() {
    this.input.value = '';
  }

  displayTodos(todos) {
    while(this.todoList.firstChild) {
      this.todoList.removeChild(this.todoList.firstChild);
    }

    if (todos.length === 0) {
      const p = this.createElement('p');
      p.textContent = 'No hay tareas que realizar. Podrias agregarla?';
      this.todoList.append(p);
    } else {
      const that = this;
      todos.forEach(function(todo) {
        const li = that.createElement('li');
        li.id = todo.id;

        //Create checkbox
        const checkbox = that.createElement('input');
        checkbox.type = 'checkbox';
        checkbox.checked = todo.complete;

        //Show Task text
        const span = that.createElement('span');
        span.contentEditable = true;
        span.classList.add('editable');

        if (todo.complete) {
          const strike = that.createElement('s');
          strike.textContent = todo.text;
          span.append(strike);
        } else {
          span.textContent = todo.text;
        }

        const deleteButton = that.createElement('button', 'delete');
        deleteButton.textContent = 'Borrar';


        li.append(checkbox, span, deleteButton);


        that.todoList.append(li);

      });
    }
  }

  bindAddTodo(handler) {
    const that = this;
    this.form.addEventListener('submit', function(event) {
      event.preventDefault();

      if (that._todoText && that._todoText !== '') {
        handler(that._todoText);
        that._resetInput();
      }
    });
  }


  bindDeleteTodo(handler) {
    const that = this;
    this.todoList.addEventListener('click', function(event) {
      console.log(event);
     // event.preventDefault();

      if (event.target.className === 'delete') {
        const id = parseInt(event.target.parentElement.id);

        handler(id);
      }

    })
  }

  bindToggleTodo(handler) {
    this.todoList.addEventListener('change', (event) =>{
      console.log(event);

      if (event.target.type === 'checkbox') {
        const id = parseInt(event.target.parentElement.id);

        handler(id);
      }

    });
  }

  bindEditTodo(handler) {
    this.todoList.addEventListener('focusout', event => {
      if (this._temporaryTodoText) {
        const id = parseInt(event.target.parentElement.id);

        handler(id, this._temporaryTodoText);

        this._temporaryTodoText = '';
      }

    })
  }
}