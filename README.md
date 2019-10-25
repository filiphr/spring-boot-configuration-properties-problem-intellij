# Demo project demonstrating properties auto complete problem in IntelliJ


Steps to see the problem:

* Open the project in IntelliJ
* Rebuild the project
* Go to `application.properties`
* Put the cursor after `example.lock.test.` 
* There will be 2 suggestions: `name` and `time`
* Add the following snippet to the `additional-spring-configuration-metadata.json`: 

```json
{
  "hints": [
    {
      "name": "example.lock.keys",
      "values": [
        {
          "value": "test",
          "description": "Test string 1."
        },
        {
          "value": "other",
          "description": "Other string."
        }
      ]
    }
  ]
}
```

* Rebuild the project
* Put the cursor after `example.lock.`
* There will be 2 suggestions: `other` and `test` (this is correct)
* Put the cursor after `example.lock.test.` 
* There are no suggestions, but there should be 2: `name` and `time`  
