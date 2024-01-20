package LLD3.Splitwise;

public class Overview {

    /**
     * A   B C D
     *
     * 1.divide people into 2 groups +/-
     *
     * 2.while both sides are not empty:
     * A -> +
     * B,C,D -> -
     *
     * get person with most amount +
     * get person whose has to pay most amount -
     *
     * ------------------------------------------------------------------------
     * Class Diagram:-
     * Noun Approach:- nouns for which we store data.
     *
     * user
     * expense
     * group
     * transaction
     *
     *
     * User:-
     * id
     * name
     * phone no
     * password
     *
     * Expense:-
     * id
     * description
     * amount
     * paidBy<User, Int>
     * hadToPay<User, Int>
     * createdAt
     * ExpenseType
     * CreatedBy
     *
     * Group:-
     * id
     * name
     * Admin
     * List<Expense>
     * List<User>
     *
     * ExpenseType:-
     * DUMMY
     * REAL
     *
     *
     * ExpenseUser:-
     * User
     * Expense
     * Amount
     * ExpenseUserType
     *
     *
     * ExpenseUserType:-
     * PAID_BY
     * HAD_TO_PAY
     *
     *
     * some expense can be part of Group , some cannot.
     *
     * Expense <-> Group (Relation)
     *
     * Group{
     *     Expense
     * }
     *
     * Expense{
     *     Group
     * }
     *
     * GroupMapping{
     *     Group
     *     Mapping
     * }
     *
     *
     * HADTOPAY / PAIDBY
     *
     * Attribute of relation b/w :- USER:EXP
     *
     * PaidBy<User, Amount>
     *
     * User can pay -> currency
     *
     * ExpensePaidBy:-
     * User
     * Expense
     * Amount
     *
     * ExpenseHadToPay:-
     * User
     * Expense
     * Amount
     *
     * ExpenseUser:-
     * User
     * Expense
     * Amount
     * ExpenseUserType
     *
     * ExpenseUserType:-
     * PAID_BY
     * HAD_TO_PAY
     *
     *
     *
     *----------------------------------------------------------------------------
     * Schema Design:-
     * Users
     * Expenses
     * Groups
     * Expense_User_Type
     * Expense_User
     * Expense_Type
     *
     *
     *
     * Primitive attributes:-
     * User:- id, same, phone_no, password
     *
     * Expenses:- id, description, amount, created_At, created_by_id, Expense_type_id, group_id
     *
     * Group:-id, name, admin_user_id
     *
     * Expense_User:- id, amount, exp_user_type_id, user_id, exp_id
     *
     * EXPENSE_USER_TYPE:- id, value
     *
     * EXPENSE_TYPE:-id, value
     *
     * Group-User:-id, User_id, Group_id
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */

    public static void main(String[] args) {
        String input = "siba shankar sahu";
        System.out.println(reverseWords(input));
    }

    public static String reverseWords(String input) {
        // Split the input string into words
        String[] words = input.split("\\s+");

        // Reverse the order of words
        StringBuilder reversedBuilder = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedBuilder.append(words[i]);
            if (i > 0) {
                reversedBuilder.append(" ");
            }
        }

        return reversedBuilder.toString();
    }
}

