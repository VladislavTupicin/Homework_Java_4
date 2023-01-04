import java.util.Stack;

public class Task_71 {
    public static void main(String[] args) {

    }

    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack<>();
        for (String str : arr) {
            if (str.equals("..")) {
                if (!st.isEmpty()) st.pop();
            } else if (!str.equals(".") && !str.isEmpty()) {
                st.push(str);
            }
        }
        String res = "";
        if (st.isEmpty()) return "/";
        while (!st.isEmpty()) {
            res = "/" + st.pop() + res;
        }

        return res;
    }
}
