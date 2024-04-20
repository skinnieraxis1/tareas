//////////Complex data types 2.2.1//////////

// Object

function object221(){

    let  testObj  =  {};
    console.log(typeof  testObj);  //  ->  object

    let  user1  =  {
        name:  "Calvin",
        surname:  "Hart",
        age:  66,
        email:  "CalvinMHart@teleworm.us"
    };
    
    let  user2  =  {
        name:  "Mateus",
        surname:  "Pinto",
        age:  21,
        email:  "MateusPinto@dayrep.com"
    };

    console.log(user1.name);  //  ->  Calvin
    console.log(user2.name);  //  ->  Mateus
    
    console.log(user1.age);  //  ->  66
    user1.age  =  67;
    console.log(user1.age);  //  ->  67
    
    console.log(user2.phone);  //  ->  undefined
    user2.phone  =  "904-399-7557";
    console.log(user2.phone);  //  ->  904-399-7557

}

// Ej profe

function ejemploProfeObject221(){

    const persona = {
        nombre: "Carlitos",
        edad: 52,
        direccion: "Av Forest1586"
    }

    persona.telefono = "9650-2310"

    console.log(persona.nombre)

    delete persona.edad

    console.log(persona)

}

// Array

function array221(){

    //array

    let  days  =  ["Sun",  "Mon",  "Tue",  "Wed",  "Thu",  "Fri",  "Sat"];
    console.log(days[0]);  //  ->  Sun
    console.log(days[2]);  //  ->  Tue
    console.log(days[5]);  //  ->  Fri
       
    days[0]  =  "Sunday";
    console.log(days[0]);  //  ->  Sunday
       
    let  emptyArray  =  [];
    console.log(emptyArray[0]);  //  ->  undefined
    
    //Matriz

    let  names  =  [["Olivia",  "Emma",  "Mia",  "Sofia"],  ["William",  "James",  "Daniel"]];
    console.log(names[0]);  //  ->  ["Olivia",  "Emma",  "Mia",  "Sofia"]
    console.log(names[0][1]);  //  ->  Emma
    console.log(names[1][1]);  //  ->  James
    
    let  femaleNames  =  names[0];
    console.log(femaleNames[0]);  //  ->  Olivia
    console.log(femaleNames[2]);  //  ->  Mia

}

// Ej profe

function ejemploProfeArray221(){

    //Array



    console.log(`\n Array \n`)



    const miArreglo = []

    miArreglo[0] = "Carlitos"
    miArreglo[2] = 15

    console.log(miArreglo[1]) // -> undefined



    console.log(`\n Array Index Of \n`)



    let alumnos = ["Fernando", "Claudio", "Dylan", "Junior"]

    console.log(alumnos.indexOf("Claudio"))

    let nombre = "Gaston"

    if(alumnos.indexOf(nombre) != -1){
        console.log("El alumno esta presente")
    }else{
        console.log("El alumno esta ausente")
    }



    console.log(`\n Array push, unshift, pop \n`)


    alumnos = ["Fernando", "Claudio", "Dylan", "Junior"]
    alumnos.push("Francisco")
    alumnos.unshift("Belen")

    console.log(alumnos)
  


    console.log(`\n pop \n`)



    let ultimoAlumno = alumnos.pop()
    console.log(ultimoAlumno)


    console.log(`\n slice \n`)


    let porcion = alumnos.slice(2)

    console.log(porcion)

    let porcionX = alumnos.slice(2, 4)

    console.log(porcionX)



    //Matriz



    console.log(`\n Matriz \n`)
    

    let  names  =  [["Olivia",  "Emma",  "Mia",  "Sofia"],  ["William",  "James",  "Daniel"]];

    for ( let i=0 ; i < names.length ; i++ ){
        for ( let x=0 ; x < names[i].length ; x++ ){
            console.log(names[i][x])
        }
    }

    console.log()

}

// Json

function json221(){

    let  user  =  [{
        name:  "Calvin",
        surname:  "Hart",
        age:  66,
        email:  "CalvinMHart@teleworm.us"
    },
    {
        name:  "Mateus",
        surname:  "Pinto",
        age:  21,
        email:  "MateusPinto@dayrep.com"
    }]

    console.log(user[1].surname)

}

//////////SECTION PRACTICE 2.2.3//////////

function questOne(){

    const ticket = {
        from: "Constitución",
        to: "Avellaneda",
        price: 450
    }
    
}

function questTwo(){

    const emptyObject = {}
    emptyObject.name = "Roberto"
    emptyObject.surname = "Carlos"

    console.log(emptyObject)

}
