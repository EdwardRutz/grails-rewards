# Rewards App

> A Grails app for managing a customer rewards program
> -  (Work in Progress)



## Dependencies

- Grails (3.3.8)
- Gradle (4.10.2)


## Notes

- Grails calls the models where data is stored, domains.
- The H2 database for development is stored in memory which means if the application is stopped then data is lost.

## Scaffolding

- Scaffolding in Grails 3 is different than in Grails 2

### Dynamic Scaffolding in Grails 3

- Enable scaffolding by setting the scaffold property in the controller to a specific domain class:

```js
class BookController {
    static scaffold = Book  // Or any other domain class such as "Author", "Publisher"
}
```

- In Grails 2:

```js
	static scaffold = true
```






## Sources

- [Mastering Grails](https://www.udemy.com/mastering-grails/learn/v4/t/lecture/1165654?start=15)
- [Grails Docs](https://grails.org/)
- [Gradle Docs](https://gradle.org/)
- [Groovy Server Pages](https://gsp.grails.org/latest/guide/index.html)



