console.log('App UPB TODO LIST!!');

const model = new TodoModel();
const view = new TodoView();
const app = new TodoController(model, view);