# INFO314-SocketClient

Hello! This is an individual homework for INFO314. In this homework assignment, you will write a program that uses TCP to connect to several different services, send input (given on the command-line) to the remote server, and prints output received from that remote server.

Fork this repository so that you have a copy of the project in your own GitHub account, then implement the missing pieces of [Java/TCPClient.java](Java/TCPClient.java) or [Python/tcpclient.py](Python/tcpclient.py), depending on whether you'd prefer to use Java or Python.

## Usage

Users of your program should be able to accept the server name and the port to connect to on the command-line when invoking your program. That is to say, if the user runs `java TCPClient localhost 8080`, your code should attempt to connect to `localhost` on port `8080`. Any command-line parameters beyond the host and port should be passed as input to the remote service, so `python3 tcpclient.py localhost 8080 one two three` should again connect to `localhost` on port `8080`, and when the connection is made, send `one two three` to the remote server before capturing the remote server's response and printing it to the console.

## Rubric (5 pts)

Capture the shell session in a video or text file, in which you use your client to connect to the following:

* djxmmx.net 17
* time.nist.gov 13
* tcpbin.com 4242 *or* 34.230.40.69 30000

The first is a "quote of the day" service and will send back a quote almost immediately. The second is a date-and-time service, and will send the current date and time, also almost immediately. The third is an "echo" service, and will reflect back whatever input you send it. (Note, you may need to Ctrl-C to terminate when connecting to the echo server, since it will sometimes remain open indefinitely waiting for input!)

Demonstrate that your program can:

* connect to the server (1 pt)
* passes input from the command line down the opened socket (2 pts)
* echoes output from the socket to the console (2pts)

There is a `run` script (`run.bat` or `run.sh`) in each of the Java and Python directories to make it easier to test against these servers. 

## Extra credit: Logging (2 pts)

* Provide diagnostic logging that describes to the console what is happening
* The logging is configurable, displaying different "levels" of logging depending on a command-line flag passed in
* **TIP:** see `java.util.logging`

## Extra credit: Threading (2 pts)

* Make your client interactive: Users can type at the console and the input goes down the socket
* **TIP:** you will need to have two Threads:
    * one Thread handles command-line I/O (System.in, System.out)
    * second Thread handles socket I/O
    * SOMEhow those Threads need to talk to one another
