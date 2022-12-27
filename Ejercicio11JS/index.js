const logger = require(`./logger`)

const porDos = num => {
    if(typeof num === "number"){
        return num * 2
    }else{
        throw new Error("Tienes que introducir un valor de tipo numerico")
    }
}
try{
    console.log(porDos())
}catch(e){
    logger.error(`Upssss! ${e}`)
}finally{
    console.log("fin")
}
