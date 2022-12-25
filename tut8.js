console.log("Starting at tut8");
console.log("================================");

const abs=(num)=>{
    const st=String(num);
    const ar=st.split(".");
    return ar[0];
}
const rr=abs(63450.0457);
console.log(rr);
