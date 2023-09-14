package com.algorithm.algorithmproject;

import java.util.Stack;

/**
 * 递归
 * 1+2+3+4+5+...+n 求和
 *
 * @author chenxin
 * @date 2023/09/14 15:09
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(forLoop(100));
        System.out.println(forLoopTail(100));
    }

    /**
     * 递归
     *
     * @param n
     * @return
     */
    public static int forLoop(int n) {
        if (n == 0)
            return n;
        int res = forLoop(n - 1);
        return n + res;
    }

    /**
     * 尾递归
     */
    public static int forLoopTail(int n) {
        if (n == 0)
            return n;
        return n + forLoopTail(n - 1);
    }

    /**
     * 用栈模拟递归
     */
    public static int forLoopStack(int n) {
        int res = 0;
        // 使用一个显式的栈来模拟系统调用栈
        Stack<Integer> stack = new Stack<>();
        for (int i = n; i > 0; i--) {
            stack.push(i);
        }

        while (!stack.empty()) {
            res += stack.pop();
        }

        return res;
    }
}
