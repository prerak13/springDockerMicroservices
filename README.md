# SpringBoot Microservices with docker.

This application is a part of medium article where I've showed how to create and dockerize springboot applications and run those services using docker-compose. Please read the article series on [Medium here.](https://medium.com/@prerakchoksi/containerization-of-spring-boot-microservices-using-docker-for-beginners-part-1-2-4eb9074bae2f)

## Contact me

- [Medium](https://medium.com/@prerakchoksi)
- [Git](https://github.com/prerak13)
- [Linkedin](https://www.linkedin.com/in/prerak13/)

## Application Architecture

![Architecture](https://miro.medium.com/max/1400/1*CMflUPV7nTa7xynr63Q1dw.png)

As shown in the figure, here we have 3 microservices running inside a bridge network. Port 8080 of app0 is exposed. Requests made on app0 is forwarded to appropriate container based on the id parameter provided in the input.

## Deployment

To run this application, go inside DockerCompose directory and run

```bash
  docker-compose up
```

This shall shart all three microservices and expose port 8080 of app0. This shall run containers based on images I've provided into the dockerhub.

## API Reference

#### Get all items

```http
  GET /?id=e1
```

```http
  GET /?id=c1
```

| Parameter | Type     | Description                           |
| :-------- | :------- | :------------------------------------ |
| `id`      | `string` | **Required**. employee or customer id |

App0 takes id parameter, according to the input, request is further routed to either employee or customer service.

## Feedback

If you have any feedback, please reach out to us at pc@dal.ca

## 🚀 About Me

I'm a full stack developer and cloud engineer currently persuing my postgraduation at Dalhousie University.
I am looking for co-op/full time job oppertunities in Canada.
Feel free to contact me on:

- [Medium](https://medium.com/@prerakchoksi)
- [Git](https://github.com/prerak13)
- [Linkedin](https://www.linkedin.com/in/prerak13/)
- pc@dal.ca
