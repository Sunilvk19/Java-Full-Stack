let timer;
let sequence = [];
let index = 0;
function fib(num){
  if(num <= 1){ return num; }
  return fib(num - 1) + fib(num - 2);
}
function RecursiveSum(arr){
    if(arr.length === 0) return 0;
    return arr[0] + RecursiveSum(arr.slice(1));
}
function start(){
    document.getElementById("output").innerHTML = "";
    document.getElementById("sum").innerHTML = "";
    sequence = [];
    index = 0;
    timer = setInterval(() => {
        let num = fib(index);
        sequence.push(num);
        document.getElementById("output").innerHTML += num +" ";
        index++;
    }, 2000);
}
function stop(){
    clearInterval(timer);
    let sum = sequence.reduce((acc, val)=> acc + val, 0);
    document.getElementById("sum").innerHTML = "Sum: " + sum;
    let recursiveSum = RecursiveSum(sequence);
    document.getElementById("sum").innerHTML += "<br>Recursive Sum: " + recursiveSum;
}