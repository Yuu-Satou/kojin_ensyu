import React from 'react'

function Result(props) {

    const submitResult = () => {
        
    }
  return (
    <div>
        <div>{props.you} - {props.com}</div>
        <button onClick={submitResult}>結果を送信</button>
    </div>
  )
}

export default Result