#include <iostream>
using namespace std;
 
// A date has day 'd', month 'm' and year 'y'
struct Date {
    int d, m, y;
};
 
// To store number of days in
// all months from January to Dec.
const int monthDays[12]
    = { 31, 28, 31, 30, 31, 30,
       31, 31, 30, 31, 30, 31 };
 
// This function counts number of
// leap years before the given date
int countLeapYears(Date d)
{
    int years = d.y;
 
    // Check if the current year needs to be
    //  considered for the count of leap years
    // or not
    if (d.m <= 2)
        years--;
 
    // An year is a leap year if it
    // is a multiple of 4,
    // multiple of 400 and not a
     // multiple of 100.
    return years / 4
           - years / 100
           + years / 400;
}
 
// This function returns number of
// days between two given dates
int getDifference(Date dt1, Date dt2)
{
    // COUNT TOTAL NUMBER OF DAYS
    // BEFORE FIRST DATE 'dt1'
 
    // initialize count using years and day
    long int n1 = dt1.y * 365 + dt1.d;
 
    // Add days for months in given date
    for (int i = 0; i < dt1.m - 1; i++)
        n1 += monthDays[i];
 
    // Since every leap year is of 366 days,
    // Add a day for every leap year
    n1 += countLeapYears(dt1);
 
    // SIMILARLY, COUNT TOTAL NUMBER OF
    // DAYS BEFORE 'dt2'
 
    long int n2 = dt2.y * 365 + dt2.d;
    for (int i = 0; i < dt2.m - 1; i++)
        n2 += monthDays[i];
    n2 += countLeapYears(dt2);
 
    // return difference between two counts
    return (n2 - n1);
}
 
// Driver code
int main()
{
    int d1;
    cin >> d1;
    int d2;
    cin >> d2;
    int m1;
    cin >> m1;
    int m2;
    cin >> m2;
    int y1;
    cin >> y1;
    int y2;
    cin >> y2;
    Date dt1 = { d1, m1, y1 };
    Date dt2 = { d2, m2, y2 };
    int d3;
    cin >> d3;
    int d4;
    cin >> d4;
    int m3;
    cin >> m3;
    int m4;
    cin >> m4;
    int y3;
    cin >> y3;
    int y4;
    cin >> y4;
    Date dt3 = { d3, m3, y3 };
    Date dt4 = { d4, m4, y4 };
 
    // Function call
    cout << getDifference(dt1, dt2);
    cout << getDifference(dt3, dt4);
 
    return 0;
}