# Java Calculator

A simple Java calculator project implementing basic arithmetic operations.
This project is used in the workshop as a combined **code review + testing** exercise.

## Project Structure

```
java-calculator/
├── pom.xml
└── src/
    ├── main/java/pt/workshop/calculator/
    │   └── Calculator.java        # Core calculator logic
    └── test/java/pt/workshop/calculator/
        └── CalculatorTest.java    # Unit tests
```

## Prerequisites

- Java 21
- Maven 3.8+


## Operations

| Operation  | Method                          |
|------------|---------------------------------|
| Addition   | `add(double a, double b)`       |
| Subtraction| `subtract(double a, double b)`  |
| Multiplication | `multiply(double a, double b)` |
| Division   | `divide(double a, double b)`    |


## Running the Tests

```bash
mvn test
```

---

## Exercise Guide (Students)

This exercise combines two engineering practices: **code review** and **unit testing**.
You will review an open pull request, identify issues in the code, and validate that
the instructor's fixes address everything you flagged.

### Step 1 — Clone the repository

Clone the workshop repository to your local machine:

```bash
git clone <repository-url>
cd Workshop-AoR-2026/java-calculator
```

Open the project in your IDE (IntelliJ IDEA recommended) as a Maven project.

---

### Step 2 — Review the pull request

The instructor will share the URL of an open pull request targeting this project.

Open the PR and review it carefully. Your goal is to:

- **Read the code** — go through `Calculator.java` and `CalculatorTest.java` line by line.
- **Identify bugs or poor practices** — look for logic errors, missing edge cases, bad naming, or anything that does not meet good coding standards.
- **Check for missing functionality** — compare what is implemented against what the project is supposed to support. Is anything absent?
- **Evaluate test coverage** — are the existing tests meaningful? Do they cover enough scenarios? Is there anything untested?

For each issue you find, **leave a comment on the PR** at the relevant line explaining:
1. What the problem is
2. Why it matters
3. What you suggest to fix it

> Do not approve the PR yet. A PR with open issues should never be approved.

---

### Step 3 — Instructor applies the fixes

After all students have submitted their review comments, the instructor will go through
each comment and apply the necessary changes to the code.

While you wait, discuss with your peers:
- Did everyone spot the same issues?
- Were there different opinions on what counts as a problem?
- Were any comments about style vs. correctness?

---

### Step 4 — Re-review and approve

Once the instructor notifies you that the fixes have been pushed, go back to the PR and:

1. **Check each of your comments** — was it addressed? Does the fix make sense?
2. **Re-read the updated diff** — make sure no new issues were introduced.
3. **Resolve your comments** as they are addressed.
4. If you are satisfied that all issues have been properly fixed, **approve the pull request**.

> Only approve when you are genuinely confident the code is ready to merge.
> Approving a PR with known unresolved issues defeats the purpose of code review.
