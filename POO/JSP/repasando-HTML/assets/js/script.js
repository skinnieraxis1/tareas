circleSalta = document.getElementsByClassName("checkSalta");
circleMendoza = document.getElementsByClassName("checkMendoza");
circleNeuquen = document.getElementsByClassName("checkNeuquen");

function functionSalta(){

    circleSalta[0].checked = true; 
    for(i = 0 ; i < circleSalta.length ; i++){
        circleSalta[i].id = "flexRadioDefault";
        circleSalta[i].disabled = false;
        
    }

    for(i = 0 ; i < circleMendoza.length ; i++){
        circleMendoza[i].disabled = "flexRadioDisabled";
        circleMendoza[i].disabled = true;
    }

    for(i = 0 ; i < circleNeuquen.length ; i++){
        circleNeuquen[i].id = "flexRadioDisabled";
        circleNeuquen[i].disabled = true;
    }
}

function functionMendoza(){

    circleMendoza[0].checked = true; 
    for(i = 0 ; i < circleSalta.length ; i++){
        circleSalta[i].id = "flexRadioDisabled";
        circleSalta[i].disabled = true;
        
    }

    for(i = 0 ; i < circleMendoza.length ; i++){
        circleMendoza[i].disabled = "flexRadioDefault";
        circleMendoza[i].disabled = false;
    }

    for(i = 0 ; i < circleNeuquen.length ; i++){
        circleNeuquen[i].id = "flexRadioDisabled";
        circleNeuquen[i].disabled = true;
    }
}

function functionNeuquen(){

    circleNeuquen[0].checked = true; 
    for(i = 0 ; i < circleSalta.length ; i++){
        circleSalta[i].id = "flexRadioDisabled";
        circleSalta[i].disabled = true;
    }

    for(i = 0 ; i < circleMendoza.length ; i++){
        circleMendoza[i].disabled = "flexRadioDisabled";
        circleMendoza[i].disabled = true;
    }

    for(i = 0 ; i < circleNeuquen.length ; i++){
        circleNeuquen[i].id = "flexRadioDefault";
        circleNeuquen[i].disabled = false;
    }
}

functionSalta()