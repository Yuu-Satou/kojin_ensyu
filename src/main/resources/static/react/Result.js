import React from 'react'

function Result(props) {

    const submitResult = () => {
      const data = {"you": props.you, "com": props.com}
        fetch("localhost:8080", {
			    headers: {
    			  'Content-Type': 'application/json' 
  			  },
  			  body: JSON.stringify(data) 
		})
    }
  return (
    <div>
        <div>{props.you} - {props.com}</div>
        <button onClick={submitResult}>結果を送信</button>
    </div>
  )
}

export default Result