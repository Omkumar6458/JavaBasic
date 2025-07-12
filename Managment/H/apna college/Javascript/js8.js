/*
function saveData(data,success,failure)
{
  let internetSpeed = Math.floor(Math.random() * 10) + 1;


  if(internetSpeed > 4)
  {
    success();
  }
  else{
    failure();
  }

}
/*
saveData(
  "om kumar", 
  
  () =>{
    console.log("your data was saved :" );
  saveData(
    "hello world ! ",
    () => {
      console.log("success 2: data 2 saved");
    },
    () => {
      console.log("failure 2 : weak connection");
    }
  )

  },

  () => {
    console.log("weak connection :" );
  }
);
*/

function saveData(data)
{
  return new Promise((resolve, reject) => 
  {
     let internetSpeed = Math.floor(Math.random() * 10) +1;

     if(internetSpeed > 4)
     {
      success("success : data was saved");

     }
     else{
      failure("failure : weak connection");
     }
  }
{

});

}

saveData("pl")
.then(() => {
  console.log("promie");
})
.catch(() => {
  console.log("promise")
});
