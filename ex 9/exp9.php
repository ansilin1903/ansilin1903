<form method="get">
  <label for="userId">User ID:</label>
  <input type="text" name="userId">
  <button type="submit">Submit</button>
</form>

<?php
if (isset($_GET['userId'])) {

  $userId = $_GET['userId'];

  $xml = simplexml_load_file('user.xml');

  // use XPath to select the user data from the XML
  $userData = $xml->xpath("//user[userid=" . $userId . "]");

  // check if user data was found
if (!empty($userData)) {
  foreach ($userData as $user) {
    echo "Username: " . $user->username . "<br>";
    echo "Email: " . $user->email . "<br>";
    echo "Device: " . $user->device . "<br>";
  }
} else
    echo "User data not found.";
}
?>