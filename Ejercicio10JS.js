function alwaysTrue(){
    return true
}
async function timeOut(){
    setTimeout(() => console.log("Hola, soy una promesa"), 5000)
}

function* indexGen(){
    let i = 0
    while(true){
        yield i += 2
    }
}
const indice = indexGen()

console.log(indice.next())
console.log(indice.next())
console.log(indice.next())
