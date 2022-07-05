function FindingArray(array){

    var numberSeqq = new Array(10);

    var minValue = Math.min(...array);
    var maxValue = minValue + numberSeqq.length;

    for(let i = minValue; i<maxValue; i++){
        if(array.indexOf(i) < 0){
            numberSeqq.push(i);
        }
    }

    return numberSeqq;
}

console.log(FindingArray([21,25,29,28,22,24,27,26,30]))

