
# 💊 PharmacyManager - Application de Gestion de Pharmacie en Java

**PharmacyManager** est une application desktop complète développée en Java avec **Swing** et **JDBC**, permettant de gérer les opérations quotidiennes d'une pharmacie : gestion des médicaments, entreprises, agents, ventes, et connexions sécurisées.

---

## 📁 Structure du projet

```
PharmacyManager/
├── src/
│   ├── Agent.java
│   ├── Midcine.java
│   ├── Vente.java
│   ├── Entereprise.java
│   ├── login.java
│   └── Principale.java
├── Capteurs/           # Contient les captures d'écran de l'application
├── database/           # Scripts SQL et schémas de la base de données
└── README.md
```

---

## 📷 Aperçu des Interfaces

### 1. Interface Client
![Interface Client](Capteurs/image22.jpg)

Permet la recherche de médicaments via un champ de texte. L’application se connecte à MySQL pour afficher les informations (nom, prix, etc.). L’interface intègre des images, descriptions et boutons de navigation vers d’autres fonctionnalités (stocks, commandes...).

---

### 2. Interface de Connexion
![Interface Connexion](Capteurs/image23.jpg)

Connexion sécurisée des utilisateurs avec vérification des identifiants dans la base MySQL.

---

### 3. Interface Médicament
![Interface Médicament](Capteurs/image24.jpg)

Gestion complète des médicaments : ajout, modification, suppression. Prise en charge des dates de fabrication/expiration, et lien avec les entreprises fournisseurs via menu déroulant.

---

### 4. Interface Agents
![Interface Agent](Capteurs/image25.jpg)

Module de gestion des agents (personnel de la pharmacie) :  
- Ajouter, modifier, supprimer un agent  
- Tableau récapitulatif  
- Informations : nom, âge, téléphone, genre

---

### 5. Interface Ventes
![Interface Vente](Capteurs/image26.png)

Gestion intuitive des ventes :  
- Saisie rapide avec ID, nom, quantité  
- Affichage automatique des stocks  
- Facturation instantanée avec impression disponible  
- Calcul automatique du montant total

---

### 6. Interface Entreprises
![Interface Entreprise](Capteurs/image27.png)

Permet de gérer les entreprises partenaires :  
- Ajouter, modifier, supprimer  
- Affichage des informations en tableau  
- Champs : nom, adresse, téléphone, expérience

---

## 🎯 Fonctionnalités principales

| Module            | Fonctionnalités clés                                                                 |
|-------------------|---------------------------------------------------------------------------------------|
| 🔐 Authentification | Connexion utilisateur sécurisée avec mot de passe visible/masqué                    |
| 👨‍⚕️ Agents         | Ajout, édition, suppression des agents + affichage automatique                       |
| 🏭 Entreprises      | Gestion des fournisseurs : informations, édition, suppression                        |
| 💊 Médicaments      | CRUD des médicaments, gestion des dates, lien avec entreprises                       |
| 💸 Ventes           | Interface simple pour vendre, générer et imprimer des factures                        |

---

## 🛠️ Technologies utilisées

- **Java 8+**
- **Swing** – interfaces graphiques
- **JDBC** – accès à la base de données
- **MySQL** – gestion des données
- **DbUtils** – gestion facilitée des tableaux
- **NetBeans IDE** – environnement de développement

---

## ⚙️ Installation & Exécution

### ✅ Prérequis
- Java Development Kit (JDK)
- MySQL Server
- NetBeans IDE ou autre environnement Java

### 🚀 Étapes d'installation

1. **Cloner le projet** :
```bash
git clone https://github.com/votre-utilisateur/pharmacie-java.git
cd pharmacie-java
```

2. **Configurer la base de données** avec les scripts SQL disponibles dans le dossier `/database/`.

3. **Ouvrir le projet** dans NetBeans.

4. **Exécuter `login.java`** pour lancer l'application.

---

## 👨‍💻 Auteur
**Youssef Loul**

- 📧 Email : [youssef.loul.ai@gmail.com](mailto:youssef.loul.ai@gmail.com)
- 🎓 Étudiant en Master en Systèmes Intelligents et Ingénierie
- 🛠️ Compétences : Java · SQL · HTML · CSS · JavaScript · PHP · Python
- 🔗 LinkedIn : [loul-youssef-21777819a](https://www.linkedin.com/in/loul-youssef-21777819a/)


---

## 📄 Licence

Projet sous **Licence MIT** — vous êtes libre d’utiliser, modifier et distribuer ce projet avec attribution.

---

## ✅ Conclusion

**PharmacyManager** fournit une solution complète, ergonomique et moderne pour la gestion quotidienne d’une pharmacie.  
Conçue pour être intuitive et flexible, cette application facilite les tâches de gestion internes et optimise les opérations courantes.

> ⭐ Si ce projet vous plaît, pensez à le noter ou à contribuer !

