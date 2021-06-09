package com.company;

public class PCLogic {public static int computerRunningLogic(int remainingNumberOfMatches) {
    int NumMatchesPC = 0;
    switch(remainingNumberOfMatches) {
        case 2:
        case 6:
        case 10:
        case 14:
            NumMatchesPC = 1;
            break;
        case 3:
        case 7:
        case 11:
        case 15:
            NumMatchesPC = 2;
            break;
        case 4:
        case 8:
        case 12:
        case 16:
        case 20:
            NumMatchesPC = 3;
            break;
        case 5:
        case 9:
        case 13:
        case 17:
        case 18:
        case 19:
    }
    return NumMatchesPC;
}
}