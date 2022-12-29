
function getFibo(num){

    const fibo = [0, 1]

    for(let i = 0; i <= 9999999999999999999999999999999999999999999999999999999999999999999999999999999999; i++){
        if(fibo[fibo.length -2] + fibo[fibo.length -1] === i){
            fibo.push(i)
        }
        if(num === 1) return [0]
        if(fibo.length === num) return fibo            
    }
}

console.log(getFibo(3))