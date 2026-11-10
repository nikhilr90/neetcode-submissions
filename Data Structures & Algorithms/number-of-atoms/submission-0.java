class Solution {
    public String countOfAtoms(String formula) {

        int n = formula.length();
        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new TreeMap<>()); // TreeMap keeps elements in alphabetical order

        int i = 0;
        while (i < n) {
            char c = formula.charAt(i);

            if (c == '(') {
                stack.push(new TreeMap<>());
                i++;
            } else if (c == ')') {
                i++;
                // Parse multiplier after ')'
                int iStart = i;
                while (i < n && Character.isDigit(formula.charAt(i))) {
                    i++;
                }
                int multiplier = (i > iStart) ? Integer.parseInt(formula.substring(iStart, i)) : 1;

                // Pop current scope and multiply counts
                Map<String, Integer> topMap = stack.pop();
                Map<String, Integer> parentMap = stack.peek();
                for (String key : topMap.keySet()) {
                    parentMap.put(key, parentMap.getOrDefault(key, 0) + topMap.get(key) * multiplier);
                }
            } else {
                // Parse element name: Uppercase letter followed by lowercase letters
                int iStart = i++;
                while (i < n && Character.isLowerCase(formula.charAt(i))) {
                    i++;
                }
                String name = formula.substring(iStart, i);

                // Parse optional number after element
                int iStartNum = i;
                while (i < n && Character.isDigit(formula.charAt(i))) {
                    i++;
                }
                int count = (i > iStartNum) ? Integer.parseInt(formula.substring(iStartNum, i)) : 1;

                // Add to the top map in stack
                Map<String, Integer> currentMap = stack.peek();
                currentMap.put(name, currentMap.getOrDefault(name, 0) + count);
            }
        }

        // Build the final result string
        Map<String, Integer> finalMap = stack.peek();
        StringBuilder sb = new StringBuilder();
        for (String name : finalMap.keySet()) {
            sb.append(name);
            int count = finalMap.get(name);
            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }
}
