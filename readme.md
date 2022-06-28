# Boxing Game

* It was created using the Constructor methods.

### Properties of the Boxer Class
* **Attributes:** name, damage, health, weight,dodge
* **Methods:** Boxer(), hit(), dodge(),
* **Notes:** 
  * Based on blocking or taking damage, the boxer's health is calculated and returned.
  * Blocking and taking damage are determined randomly with each punch.

### Properties of the Match Class
* **Attributes:** b1, b2, minWeight, maxWeight, roundCounter, firstPunch
* **Methods:** Match(), run(), checkWeight(), isWin(), printStatus(), firstPunch(),
* **Notes:** 
  * It is checked whether the weights of the boxer are compatible with each other.
  * The match continues until one of the boxers has 0 health.
  * In each round, who will throw the first punch is determined randomly.