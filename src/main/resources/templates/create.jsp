<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Create Stock</title>
</head>
<body>
    <h2>Create New Stock</h2>
    <form action="/stocks/create" method="post">
        <label for="stockname">Stock Name:</label>
        <input type="text" id="stockname" name="stockname" required /><br /><br />

        <label for="pricedate">Price Date:</label>
        <input type="date" id="pricedate" name="pricedate" required /><br /><br />

        <label for="price">Price:</label>
        <input type="number" id="price" name="price" step="0.01" required /><br /><br />

        <label for="quantity">Quantity:</label>
        <input type="number" id="quantity" name="quantity" required /><br /><br />

        <label for="volume">Volume:</label>
        <input type="number" id="volume" name="volume" required /><br /><br />

        <input type="submit" value="Create Stock" />
    </form>
</body>
</html>
