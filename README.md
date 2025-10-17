# LP1-SPOS-Practicals-SEM-5-SPPU
🧪 SPOS Java Practicals - SEM 5 (SPPU)

This repository contains all Java practicals for **SPOS (Operating Systems)** of Semester 5.

---

## 📁 Folder Structure & Practical Descriptions

| Folder   | Description |
|----------|-------------|
| 📂 pract1   | Pass-I Assembler: first pass of two-pass assembler, symbol table and intermediate code generation |
| 📂 pract2   | Pass-II Assembler: second pass, converts intermediate code into machine code |
| 📂 pract3   | Pass-I Macro Processor: first pass, handles macro definitions and generates macro definition table (MDT) |
| 📂 pract4   | Pass-II Macro Processor: second pass, expands macros using macro name table (MNT) and MDT |
| 📂 pract5   | Dynamic Link Library (DLL) practicals |
| 📂 pract6   | Mutex and Semaphore synchronization problems |
| 📂 pract7   | Process Scheduling Algorithms: FCFS, Priority (preemptive/non-preemptive), SJF (preemptive/non-preemptive), Round Robin |
| 📂 pract8   | Memory Allocation Algorithms: First Fit, Best Fit, Next Fit, Worst Fit |
| 📂 pract9   | Page Replacement Algorithms: FIFO, LRU, Optimal |
| 📂 pract10  | Banker’s Algorithm for deadlock avoidance |

> **Note:** `.class` files are ignored via `.gitignore`.

---

## 🚀 How to Run Java Practicals

You can run the programs in **two ways**:

### 1️⃣ Inside the practical folder (simple way)
1. Navigate to the folder of the practical you want to run:
```bash
cd pract1
```
2. Compile the Java program:
```bash
javac Pass1.java
```

3. Run the program:
```bash
java Pass1
```

Works for simple practicals. If this does not work, use Method 2 below.

1. Stay in the main folder: Ex.
```bash
cd C:\Users\user\OneDrive\Desktop\SPOS_PRACT

```
2. Compile the Java program by specifying the folder:
```bash
javac pract8\BestFit.java
```

3. Run the program using the folder as a package:
```bash
java pract8.BestFit
```

Recommended if your practicals are inside subfolders. Works for all Pract1 → Pract10.


🔹 Quick Steps to Run Practicals

1. Clone the repo:
git clone https://github.com/Payaljadhav30/LP1-SPOS-Practicals-SEM-5-SPPU.git

2. Navigate to Folder
cd pract1

3. Compile and Run by any suitable method from given 2 methods
