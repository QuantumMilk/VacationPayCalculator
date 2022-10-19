<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Calculate</title>
    <link rel="stylesheet" href="src/main/resources/static/style.css"/>
</head>
<body>
<h1>Calculate</h1>
<form action="/calculate" method="get">
    <table border="1px">
        <tr>
            <td>
                <label>Salary</label>
                <input type="number" name="salary">
            </td>
            <td>
                <label>Vacation days</label>
                <input type="text" name="vacationDays">
            </td>
            <td>
                <input type="submit" value="Calculate">
            </td>
        </tr>
    </table>
</form>
<table>
    <tr>
        <td>
            <label>Vacation pay:</label>
        </td>
        <td>
            <label>${amountOfMoney}</label>
        </td>
    </tr>
</table>
<br>
</body>
</html>