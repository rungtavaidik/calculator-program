const n1 = prompt("Enter the first number");
    const n2 = prompt("Enter the second number");
    const o = prompt("Choose whether to:\n[1] Add\n[2] Subtract\n[3] Multiply\n[4] Divide");
    const r=0;
    if (o==1) {
        r = n1+n2
        console.log("Result: "+r);
    } else if (o==2) {
        r = n1-n2;
        console.log("Result: "+r);
    } else if(o==3) {
        r = n1*n2;
        console.log("Result: "+r);
    } else if (o==4) {
        r = n1/n2;
        console.log("Result: "+r);
    } else {
        console.log("Invalid choice. Please choose either 1, 2, 3 or 4.");
    }
