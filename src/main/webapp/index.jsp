<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>well come</title>
</head>
<body>
<form method="post" action="Reservations">
    <h3> Name </h3>
    <input type="text"    name="Name">
    <h3>National Code </h3>
    <input type="text"  name="nationalCode">
    <h3>Start date of stay  </h3>
    <input type="text"  name="Start date of stay  ">
    <h3>End date of stay  </h3>
    <input type="text"  name="End date of stay  ">
    <h3>Room capacity </h3>
    <input type="text"  name="Room capacity  ">
    <br>
    <input type="submit" value="Reservations">
</form>

<form method="post" action="ChangeInformation">
    <h2> change Reservation information  </h2>
    <h3>Reservation code </h3>
    <input type="text"  name="reservationcode ">
    <h3>Start date of stay  </h3>
    <input type="text"  name="Start date of stay  ">
    <h3>End date of stay  </h3>
    <input type="text"  name="End date of stay  ">
    <br>
    <h3>Room capacity  </h3>
    <input type="text"  name="Room capacity  ">
    <br>
    <input type="submit" value="ChangeInformation">
</form>



<form method="post" action="ViweRoom">
    <h2> View Reservation information  </h2>
    <h3>Reservation code or national Code </h3>
    <input type="text"  name="code ">
    <input type="submit" value="ChangeInformation">
</form>




<form method="post" action="cancelRoom">
    <h2> Cancellation </h2>
    <h3>Reservation </h3>
    <input type="text"  name="code ">
    <input type="submit" value="ChangeInformation">
</form>


</body>
</html>