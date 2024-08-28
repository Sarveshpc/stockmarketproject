<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Search Stock</title>
</head>
<body>
    <h2>Search Stock</h2>
    <form action="/stocks/search" method="get">
        <label for="stockname">Stock Name:</label>
        <input type="text" id="stockname" name="stockname" /><br /><br />

        <label for="pricedate">Price Date:</label>
        <input type="date" id="pricedate" name="pricedate" /><br /><br />

        <input type="submit" value="Search Stock" />
    </form>

    <c:if test="${not empty stocks}">
        <h3>Stock Results:</h3>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Stock Name</th>
                    <th>Price Date</th>
                    <th>Price</th>
                    <th>Quantity</th>
                    <th>Volume</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="stock" items="${stocks}">
                    <tr>
                        <td><c:out value="${stock.id}"/></td>
                        <td><c:out value="${stock.stockname}"/></td>
                        <td><c:out value="${stock.pricedate}"/></td>
                        <td><c:out value="${stock.price}"/></td>
                        <td><c:out value="${stock.quantity}"/></td>
                        <td><c:out value="${stock.volume}"/></td>
                        <td>
                            <form action="/stocks/delete" method="post" style="display:inline;">
                                <input type="hidden" name="id" value="${stock.id}"/>
                                <input type="submit" value="Delete"/>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
</body>
</html>
