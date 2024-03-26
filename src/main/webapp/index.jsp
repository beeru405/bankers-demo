<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Web Calculator</title>
</head>
<body>
    <h2>Web Calculator</h2>
    <form action="calculator" method="post">
        <label for="num1">Number 1:</label>
        <input type="text" id="num1" name="num1" required><br><br>
        
        <label for="num2">Number 2:</label>
        <input type="text" id="num2" name="num2" required><br><br>
        
        <label for="operator">Select Operator:</label>
        <select id="operator" name="operator">
            <option value="add">Addition (+)</option>
            <option value="subtract">Subtraction (-)</option>
            <option value="multiply">Multiplication (*)</option>
            <option value="divide">Division (/)</option>
        </select><br><br>
        
        <button type="submit" id="calculate">Calculate</button>
    </form>
    
    <div id="result">
        <!-- Result will be displayed here -->
    </div>
</body>
</html>
