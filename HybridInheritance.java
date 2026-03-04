class Vehicle{
Vehicle(){
System.out.println("Vehicle");}}
class Car extends Vehicle{
Car(){
System.out.println("This is a Car");}
}
class Bmw extends Car{
Bmw(){
System.out.println("Bmw is a Car");}}
class Motorcycle extends Vehicle{
Motorcycle(){
System.out.println("This is a Motorcycle");}}
public class HybridInheritance{
public static void main(String[]args){
Bmw b=new Bmw();
Motorcycle m=new Motorcycle();}}