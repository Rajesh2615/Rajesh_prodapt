document.addEventListener("DOMContentLoaded", function() {
    const form = document.getElementById("use-case-form");
    const tableBody = document.querySelector("#userdetails tbody");
   
    function isValidMobileNumber(mobileNumber) {
      const regex = /^[7-9]\d{9}$/;
      return regex.test(mobileNumber);
    }
   
    function validateName(name) {
      var nameRegex = /^[A-Za-z]+$/;
      return nameRegex.test(name);
      }
      // Function to validate email
    function validateEmail(email) {
      var emailRegex = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
      return emailRegex.test(email);
    }
   
    form.addEventListener("submit", function(event) {
      event.preventDefault();
   
      const name = document.getElementById("name").value;
      const email = document.getElementById("email").value;
      const contact = document.getElementById("contact").value;
      const accountType = document.getElementById("account-type").value;
   
      if (name && email && contact && accountType !== "None")  {
        if (validateName(name) && validateEmail(email) && isValidMobileNumber(contact)){
                  const newRow = document.createElement("tr");
              newRow.innerHTML = `
                <td>${name}</td>
                <td>${email}</td>
                <td>${contact}</td>
                <td>${accountType}</td>
              `;
              tableBody.appendChild(newRow);
   
              form.reset();
        }else{
          alert("Invalid input on fields on name, email, contact no");
        }
      } else {
        alert("Please fill out all fields, select an account type");
      }
    });
  });