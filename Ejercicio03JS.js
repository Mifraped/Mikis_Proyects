let str1 = "Miguel"
let str2 = "Franco"

let estudiante1 = `${str1} ${str2}`
let estudiante2 = str1 + " " + str2
let estudiante3 = str1.concat(" ",str2)

let estudianteMayus = estudiante1.toUpperCase()
let estudianteMinus = estudiante2.toLowerCase()

let numChar = estudiante3.length

let char1nom1 = str1[0]
let char1nom2 = str1.charAt(0)

let charFinAp1 = str2[5]
let charFinAp2 = str2.charAt(str2.length - 1)

let sinEsp = estudiante1.replace(/ /g,"")

let estaNomEnEst1 = estudiante1.includes("Miguel")
let estaNomEnEst2 = estudiante1.includes(str1)
let estaNomEnEst3 = estudiante1.includes(`${str1}`)


console.log(estaNomEnEst3)
