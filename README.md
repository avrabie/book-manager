##### Preerquisites:
1. Have kubectl / kubernetes cluster such as GKE


##### Steps:
1. mvn clean install
2. mvn spring-boot:build-image
3. docker push `moldovean/book-manager:0.0.1-SNAPSHOT`
5. kubectl apply -f deployments/mongodb-service.yaml
5. kubectl apply -f deployments/books.yaml
5. kubectl apply -f deployments/books-service.yaml
6. `kubectl delete -f` 
