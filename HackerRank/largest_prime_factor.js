process.stdin.resume();
process.stdin.setEncoding("ascii");
var input = "";
process.stdin.on("data", function (chunk) {
    input += chunk;
});
process.stdin.on("end", function () {
    // now we can read/parse input
    largestPrimeFactor(input)
});

function largestPrimeFactor(number){
    
    let div = 2, ip = number;
    
    while(ip>1) {
        
        if(ip%div!=0)
        {
            div++;
        }
        else
        {
            ip=ip/div;
        }
    }
    
    console.log(div);
}
