<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>

<html>
<head>
  <meta charset="utf-8">
  <title>Feedback Form</title>
  <link rel="stylesheet" href="styleu.css">
</head>

<body>

  <div class="container">
    <h1><span>👍 FeedBack 👎</span></h1>

    <div class="form-container form__wrapper">
      
      <form id="feedback-form" 
      action="" method="post"  >
        <div class="form-row">
          
          <div class="form-group">
            <label for="name" class="control-label">Name</label>
            <input id="name" type="text" name="name" class="form-control"  placeholder="Name" minlength="2"
              maxlength="30" required="required">
            <div class="invalid-feedback"></div>
          </div>
          
          <div class="form-group">
            <label for="email" class="control-label">Email address</label>
            <input id="email" type="email" name="email" required="required" class="form-control" value=""
              placeholder="Email-address">
            <div class="invalid-feedback"></div>
          </div>
        </div>
        
        <div class="form-group">
          <label for="message" class="control-label">Message (at least 20 characters)</label>
          <textarea id="message" name="message" class="form-control" rows="3"
            placeholder="Message (at least 20 characters)" minlength="20" maxlength="500"
            required="required"></textarea>
          <div class="invalid-feedback"></div>
        </div>

        <div class="feedback-type">
          <span>Feedback Type<br></span>
          <input type="radio" name="feedback" id="comrad"><label for="comrad">Comment</label>
          <input type="radio" name="feedback" id="sugrad"><label for="sugrad">Suggestion</label>
          <input type="radio" name="feedback" id="comprad"><label for="comprad">Complaint</label>
        </div>        

        <div class="app">
          <h1>Was this service helpful?</h1>
          <p>Let us know how we did</p>
        
          <div class="container">
            <div class="item">
              <label for="0">
              <input class="radio" type="radio" name="zero" id="0"  required>
              <span>🤬</span>
            </label>
            </div>
        
            <div class="item">
              <label for="1">
              <input class="radio" type="radio" name="zero" id="1"  required>
              <span>🙁</span>
            </label>
            </div>
        
            <div class="item">
              <label for="2">
              <input class="radio" type="radio" name="zero" id="2" required>
              <span>😶</span>
            </label>
            </div>
        
            <div class="item">
              <label for="3">
              <input class="radio" type="radio" name="zero" id="3"  required>
              <span>😁</span>
            </label>
            </div>
        
            <div class="item">
              <label for="4">
              <input class="radio" type="radio" name="zero" id="4"  required>
              <span>😍</span>
            </label>
            </div>
        
          </div>
        </div>
        
        

        
        <div class="form-submit">
          <button type="submit">Submit</button>
        </div>

      </form>

      <div class="form-image">
        <img src="feedback.png" alt="Your Image">
      </div>
      

    </div>

    <a href="office.jsp">Office Use</a>

  </div>
  <script>
    const form = document.getElementById("feedback-form");

form.addEventListener("submit", function(event) {
  event.preventDefault();

  const name = document.getElementById("name");
  const email = document.getElementById("email");
  const message = document.getElementById("message");
  const feedback = document.querySelector('input[name="feedback"]:checked');
  const rating = document.querySelector('input[name="zero"]:checked');

  if (!name.value) {
    name.classList.add("is-invalid");
    name.nextElementSibling.innerHTML = "Please enter your name";
  } else {
    name.classList.remove("is-invalid");
    name.nextElementSibling.innerHTML = "";
  }

  if (!email.value) {
    email.classList.add("is-invalid");
    email.nextElementSibling.innerHTML = "Please enter your email";
  } else {
    email.classList.remove("is-invalid");
    email.nextElementSibling.innerHTML = "";
  }

  if (!message.value) {
    message.classList.add("is-invalid");
    message.nextElementSibling.innerHTML = "Please enter a message";
  } else {
    message.classList.remove("is-invalid");
    message.nextElementSibling.innerHTML = "";
  }

  if (!feedback) {
    alert("Please select a feedback type");
  }

  if (!rating) {
    alert("Please rate the page");
  }

  if (name.value && email.value && message.value && feedback && rating) {
	  alert("thanks for your valuable words");
    form.submit();
  }
});

  </script>


</body>

</html>