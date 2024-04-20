//////////typeConversions 2.1.4//////////

function typeConversions214(){
    const  str  =  String();
    const  num  =  Number();
    const  bool  =  Boolean();
    
    console.log(str);  //  ->
    console.log(num);  //  ->  0
    console.log(bool);  //  ->  false
    
    const  big1  =  BigInt(42);
    console.log(big1);  //  ->  42n
    
    const  big2  =  BigInt();      //  ->  Uncaught  TypeError:  Cannot  convert  undefined  to  a  BigInt

}

//////////typeConversions 2.1.5//////////

function conversions215(){
    const num = 42

    const strFromNum1 = String(num)
    const strFromNum2 = String(8)
    const strFromBoo1 = String(true)
    const numFromStr = Number("312")
    const boolFromNumber = Boolean(0)
}


// Ej profe

function ejemploProfe215(){
    const numero = 312

    let cadena = String(numero)

    console.log(typeof(numero))
    console.log(typeof(cadena))

    console.log(`${numero} esto es un ${typeof(numero)}`)
    console.log(cadena + " Esto es un " + typeof(cadena))
}

//////////Boolean Conversion 2.1.8//////////

function booleanConversion218(){
    console.log(Boolean(true)); // -> true
    
    console.log(Boolean(42)); // -> true
    console.log(Boolean(0)); // -> false
    console.log(Boolean(NaN)); // -> false
    
    console.log(Boolean("text")); // -> true
    console.log(Boolean("")); // -> false
    
    console.log(Boolean(undefined)); // -> false
    
    console.log(Boolean(null)); // -> false
}


// Ej profe

function ejemploProfe218(){
    var number = 15
    while (number){
        number--
        console.log(number)
    }

}

//////////Implicit Conversions 2.1.10//////////

function implicitConversions2110(){

    const  str1  =  42  +  "1";
    console.log(str1);                //  ->  421
    console.log(typeof  str1);  //  ->  string
    
    const  str2  =  42  -  "1";
    console.log(str2);                //  ->  41
    console.log(typeof  str2);  //  ->  number

}


// Ej profe

function ejemploProfe2110(){


}