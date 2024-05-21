import Board from './Board';
import './App.css';

let dom = document.querySelector("#root");
ReactDOM.render(<App></App>, dom);

function App() {
	
  return (
    <div className="App">
      <Board />
    </div>
  );
}

export default App;
