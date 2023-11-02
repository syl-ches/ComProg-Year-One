function validate() {
    alert(document.getElementsByName("email")[0].value);
    if (name == "" || name == null) {
      alert('Please enter a name');
      return false;
    } else {
      return true;
    }
  }
