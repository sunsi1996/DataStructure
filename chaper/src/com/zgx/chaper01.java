package com.zgx;

/**
 * @author sunsi
 * @version 1.0
 * @date 2021/4/7 8:44
 */
public class chaper01 {
    public static void main(String[] args) {
        int chessData[][] = new int[11][11];
        chessData[1][2] = 1;
        chessData[2][3] = 2;
        int sum = 0;//计数器，算出不为0的数据
        System.out.println("原始数据:");
        for (int[] chessDatum : chessData) {
            for (int i : chessDatum) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }


        //将二维数组转稀疏数组
        for (int[] chessDatum : chessData) {
            for (int i : chessDatum) {
                if (i != 0) {
                    sum++;
                }
            }
        }
        System.out.println("sum:" + sum);

        //创建稀疏数据大小
        int[][] xishu = new int[sum + 1][3];
        //初始化稀疏数组
        xishu[0][0] = 11;
        xishu[0][1] = 11;
        xishu[0][2] = sum;

        //生成稀疏数组
        int count = 0;//计算器记录数组值的位置
        //读行的
        for (int i = 0; i < chessData.length; i++) {
            for (int j = 0; j < chessData[i].length; j++) {
                //一行行的读取，并且一列列的读值，获取数据，拿出来判断是否非0
                if(chessData[i][j]!=0){
                    count++;
                    xishu[count][0] = i;
                    xishu[count][1] = j;
                    xishu[count][2] = chessData[i][j];
                }
            }
        }

        System.out.println();
        System.out.println("==稀疏数组为==");

        //输出稀疏数组
        for (int i = 0; i < xishu.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n",xishu[i][0],xishu[i][1],xishu[i][2]);
        }

        //将稀疏数组转二位数组
        int[][]  chessArry= new int[xishu[0][0]][xishu[0][1]];
        for (int i = 1; i < xishu.length; i++) {
           chessArry[xishu[i][0]][xishu[i][1]] = xishu[i][2];
        }

        System.out.println();
        System.out.println("稀疏数组还原二位数组:");
        for (int[] chessDatum : chessArry) {
            for (int i : chessDatum) {
                System.out.printf("%d\t", i);
            }
            System.out.println();
        }
    }
  }
