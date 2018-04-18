[![License](https://img.shields.io/badge/license-MIT-blue.svg)](https://opensource.org/licenses/MIT)


# About
This is a small utility to analyze a xml document structure and print out some base statistics.
# Docker
## Build
```
docker build -t xanalyzer .
```
## Run

### Linux / OSX
```
docker run --rm -it-v /data/xanalyzer/:/data/ xanalyzer "/data/full database.xml"
```
### Windows
```
docker run --rm -it -v c:/data/xanalyzer/:/data/ xanalyzer "/data/full database.xml"
```

#### Example output for drugbank
 ```
# Root Node{name: "XML Document", count: 1 , valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: ""}
| # Node{name: "drugbank", count: 1 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank", parent.name: "XML Document"}
| | * Attribute{name: "schemaLocation", count: 1 (100%), valueCount: 1 (100%), minLength: 63, maxLength: 63, xPath: "/drugbank/@schemaLocation", parent.name: "drugbank"}
| | * Attribute{name: "exported-on", count: 1 (100%), valueCount: 1 (100%), minLength: 10, maxLength: 10, xPath: "/drugbank/@exported-on", parent.name: "drugbank"}
| | * Attribute{name: "version", count: 1 (100%), valueCount: 1 (100%), minLength: 3, maxLength: 3, xPath: "/drugbank/@version", parent.name: "drugbank"}
| | # Node{name: "drug", count: 11033 (1103300%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug", parent.name: "drugbank"}
| | | * Attribute{name: "created", count: 11033 (100%), valueCount: 11033 (100%), minLength: 10, maxLength: 10, xPath: "/drugbank/drug/@created", parent.name: "drug"}
| | | * Attribute{name: "type", count: 11033 (100%), valueCount: 11033 (100%), minLength: 7, maxLength: 14, xPath: "/drugbank/drug/@type", parent.name: "drug"}
| | | * Attribute{name: "updated", count: 11033 (100%), valueCount: 11033 (100%), minLength: 10, maxLength: 10, xPath: "/drugbank/drug/@updated", parent.name: "drug"}
| | | # Node{name: "toxicity", count: 11033 (100%), valueCount: 7517 (68.1%), minLength: 1, maxLength: 1973, xPath: "/drugbank/drug/toxicity", parent.name: "drug"}
| | | # Node{name: "snp-adverse-drug-reactions", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/snp-adverse-drug-reactions", parent.name: "drug"}
| | | | # Node{name: "reaction", count: 113 (1%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/snp-adverse-drug-reactions/reaction", parent.name: "snp-adverse-drug-reactions"}
| | | | | # Node{name: "pubmed-id", count: 113 (100%), valueCount: 108 (95.6%), minLength: 8, maxLength: 8, xPath: "/drugbank/drug/snp-adverse-drug-reactions/reaction/pubmed-id", parent.name: "reaction"}
| | | | | # Node{name: "protein-name", count: 113 (100%), valueCount: 113 (100%), minLength: 8, maxLength: 64, xPath: "/drugbank/drug/snp-adverse-drug-reactions/reaction/protein-name", parent.name: "reaction"}
| | | | | # Node{name: "uniprot-id", count: 113 (100%), valueCount: 113 (100%), minLength: 6, maxLength: 6, xPath: "/drugbank/drug/snp-adverse-drug-reactions/reaction/uniprot-id", parent.name: "reaction"}
| | | | | # Node{name: "allele", count: 113 (100%), valueCount: 68 (60.2%), minLength: 5, maxLength: 22, xPath: "/drugbank/drug/snp-adverse-drug-reactions/reaction/allele", parent.name: "reaction"}
| | | | | # Node{name: "description", count: 113 (100%), valueCount: 113 (100%), minLength: 64, maxLength: 220, xPath: "/drugbank/drug/snp-adverse-drug-reactions/reaction/description", parent.name: "reaction"}
| | | | | # Node{name: "rs-id", count: 113 (100%), valueCount: 100 (88.5%), minLength: 6, maxLength: 11, xPath: "/drugbank/drug/snp-adverse-drug-reactions/reaction/rs-id", parent.name: "reaction"}
| | | | | # Node{name: "gene-symbol", count: 113 (100%), valueCount: 113 (100%), minLength: 2, maxLength: 8, xPath: "/drugbank/drug/snp-adverse-drug-reactions/reaction/gene-symbol", parent.name: "reaction"}
| | | | | # Node{name: "adverse-reaction", count: 113 (100%), valueCount: 203 (179.6%), minLength: 1, maxLength: 35, xPath: "/drugbank/drug/snp-adverse-drug-reactions/reaction/adverse-reaction", parent.name: "reaction"}
| | | # Node{name: "general-references", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/general-references", parent.name: "drug"}
| | | | # Node{name: "links", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/general-references/links", parent.name: "general-references"}
| | | | | # Node{name: "link", count: 1462 (13.3%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/general-references/links/link", parent.name: "links"}
| | | | | | # Node{name: "title", count: 1462 (100%), valueCount: 1468 (100.4%), minLength: 1, maxLength: 254, xPath: "/drugbank/drug/general-references/links/link/title", parent.name: "link"}
| | | | | | # Node{name: "url", count: 1462 (100%), valueCount: 2230 (152.5%), minLength: 1, maxLength: 694, xPath: "/drugbank/drug/general-references/links/link/url", parent.name: "link"}
| | | | # Node{name: "articles", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/general-references/articles", parent.name: "general-references"}
| | | | | # Node{name: "article", count: 7452 (67.5%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/general-references/articles/article", parent.name: "articles"}
| | | | | | # Node{name: "pubmed-id", count: 7452 (100%), valueCount: 7434 (99.8%), minLength: 3, maxLength: 8, xPath: "/drugbank/drug/general-references/articles/article/pubmed-id", parent.name: "article"}
| | | | | | # Node{name: "citation", count: 7452 (100%), valueCount: 7488 (100.5%), minLength: 1, maxLength: 1224, xPath: "/drugbank/drug/general-references/articles/article/citation", parent.name: "article"}
| | | | # Node{name: "textbooks", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/general-references/textbooks", parent.name: "general-references"}
| | | | | # Node{name: "textbook", count: 174 (1.6%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/general-references/textbooks/textbook", parent.name: "textbooks"}
| | | | | | # Node{name: "citation", count: 174 (100%), valueCount: 212 (121.8%), minLength: 1, maxLength: 224, xPath: "/drugbank/drug/general-references/textbooks/textbook/citation", parent.name: "textbook"}
| | | | | | # Node{name: "isbn", count: 174 (100%), valueCount: 85 (48.9%), minLength: 10, maxLength: 17, xPath: "/drugbank/drug/general-references/textbooks/textbook/isbn", parent.name: "textbook"}
| | | # Node{name: "average-mass", count: 9100 (82.5%), valueCount: 9100 (100%), minLength: 5, maxLength: 9, xPath: "/drugbank/drug/average-mass", parent.name: "drug"}
| | | # Node{name: "pharmacodynamics", count: 11033 (100%), valueCount: 9587 (86.9%), minLength: 1, maxLength: 2393, xPath: "/drugbank/drug/pharmacodynamics", parent.name: "drug"}
| | | # Node{name: "msds", count: 1295 (11.7%), valueCount: 1295 (100%), minLength: 65, maxLength: 65, xPath: "/drugbank/drug/msds", parent.name: "drug"}
| | | # Node{name: "calculated-properties", count: 9736 (88.2%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/calculated-properties", parent.name: "drug"}
| | | | # Node{name: "property", count: 233866 (2402.1%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/calculated-properties/property", parent.name: "calculated-properties"}
| | | | | # Node{name: "kind", count: 233866 (100%), valueCount: 233866 (100%), minLength: 4, maxLength: 24, xPath: "/drugbank/drug/calculated-properties/property/kind", parent.name: "property"}
| | | | | # Node{name: "source", count: 233866 (100%), valueCount: 233866 (100%), minLength: 6, maxLength: 8, xPath: "/drugbank/drug/calculated-properties/property/source", parent.name: "property"}
| | | | | # Node{name: "value", count: 233866 (100%), valueCount: 252376 (107.9%), minLength: 1, maxLength: 2582, xPath: "/drugbank/drug/calculated-properties/property/value", parent.name: "property"}
| | | # Node{name: "cas-number", count: 11033 (100%), valueCount: 5629 (51%), minLength: 7, maxLength: 12, xPath: "/drugbank/drug/cas-number", parent.name: "drug"}
| | | # Node{name: "mixtures", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/mixtures", parent.name: "drug"}
| | | | # Node{name: "mixture", count: 255243 (2313.5%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/mixtures/mixture", parent.name: "mixtures"}
| | | | | # Node{name: "name", count: 255243 (100%), valueCount: 258981 (101.5%), minLength: 1, maxLength: 367, xPath: "/drugbank/drug/mixtures/mixture/name", parent.name: "mixture"}
| | | | | # Node{name: "ingredients", count: 255243 (100%), valueCount: 255243 (100%), minLength: 3, maxLength: 1921, xPath: "/drugbank/drug/mixtures/mixture/ingredients", parent.name: "mixture"}
| | | # Node{name: "external-links", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/external-links", parent.name: "drug"}
| | | | # Node{name: "external-link", count: 3085 (28%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/external-links/external-link", parent.name: "external-links"}
| | | | | # Node{name: "resource", count: 3085 (100%), valueCount: 3085 (100%), minLength: 6, maxLength: 9, xPath: "/drugbank/drug/external-links/external-link/resource", parent.name: "external-link"}
| | | | | # Node{name: "url", count: 3085 (100%), valueCount: 3173 (102.9%), minLength: 1, maxLength: 90, xPath: "/drugbank/drug/external-links/external-link/url", parent.name: "external-link"}
| | | # Node{name: "pdb-entries", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/pdb-entries", parent.name: "drug"}
| | | | # Node{name: "pdb-entry", count: 98634 (894%), valueCount: 98634 (100%), minLength: 4, maxLength: 4, xPath: "/drugbank/drug/pdb-entries/pdb-entry", parent.name: "pdb-entries"}
| | | # Node{name: "food-interactions", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/food-interactions", parent.name: "drug"}
| | | | # Node{name: "food-interaction", count: 1194 (10.8%), valueCount: 1228 (102.8%), minLength: 1, maxLength: 414, xPath: "/drugbank/drug/food-interactions/food-interaction", parent.name: "food-interactions"}
| | | # Node{name: "state", count: 8587 (77.8%), valueCount: 8587 (100%), minLength: 3, maxLength: 6, xPath: "/drugbank/drug/state", parent.name: "drug"}
| | | # Node{name: "synthesis-reference", count: 11033 (100%), valueCount: 1791 (16.2%), minLength: 1, maxLength: 845, xPath: "/drugbank/drug/synthesis-reference", parent.name: "drug"}
| | | # Node{name: "mechanism-of-action", count: 11033 (100%), valueCount: 8132 (73.7%), minLength: 1, maxLength: 2731, xPath: "/drugbank/drug/mechanism-of-action", parent.name: "drug"}
| | | # Node{name: "absorption", count: 11033 (100%), valueCount: 2528 (22.9%), minLength: 1, maxLength: 1060, xPath: "/drugbank/drug/absorption", parent.name: "drug"}
| | | # Node{name: "synonyms", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/synonyms", parent.name: "drug"}
| | | | # Node{name: "synonym", count: 17148 (155.4%), valueCount: 17433 (101.7%), minLength: 1, maxLength: 434, xPath: "/drugbank/drug/synonyms/synonym", parent.name: "synonyms"}
| | | | | * Attribute{name: "coder", count: 17148 (100%), valueCount: 2975 (17.3%), minLength: 2, maxLength: 61, xPath: "/drugbank/drug/synonyms/synonym/@coder", parent.name: "synonym"}
| | | | | * Attribute{name: "language", count: 17148 (100%), valueCount: 2707 (15.8%), minLength: 5, maxLength: 29, xPath: "/drugbank/drug/synonyms/synonym/@language", parent.name: "synonym"}
| | | # Node{name: "pathways", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/pathways", parent.name: "drug"}
| | | | # Node{name: "pathway", count: 4639 (42%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/pathways/pathway", parent.name: "pathways"}
| | | | | # Node{name: "drugs", count: 4639 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/pathways/pathway/drugs", parent.name: "pathway"}
| | | | | | # Node{name: "drug", count: 62476 (1346.8%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/pathways/pathway/drugs/drug", parent.name: "drugs"}
| | | | | | | # Node{name: "name", count: 62476 (100%), valueCount: 62476 (100%), minLength: 3, maxLength: 70, xPath: "/drugbank/drug/pathways/pathway/drugs/drug/name", parent.name: "drug"}
| | | | | | | # Node{name: "drugbank-id", count: 62476 (100%), valueCount: 62476 (100%), minLength: 7, maxLength: 7, xPath: "/drugbank/drug/pathways/pathway/drugs/drug/drugbank-id", parent.name: "drug"}
| | | | | # Node{name: "name", count: 4639 (100%), valueCount: 4655 (100.3%), minLength: 1, maxLength: 100, xPath: "/drugbank/drug/pathways/pathway/name", parent.name: "pathway"}
| | | | | # Node{name: "enzymes", count: 4639 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/pathways/pathway/enzymes", parent.name: "pathway"}
| | | | | | # Node{name: "uniprot-id", count: 83932 (1809.3%), valueCount: 83932 (100%), minLength: 6, maxLength: 10, xPath: "/drugbank/drug/pathways/pathway/enzymes/uniprot-id", parent.name: "enzymes"}
| | | | | # Node{name: "category", count: 4639 (100%), valueCount: 4639 (100%), minLength: 7, maxLength: 15, xPath: "/drugbank/drug/pathways/pathway/category", parent.name: "pathway"}
| | | | | # Node{name: "smpdb-id", count: 4639 (100%), valueCount: 4639 (100%), minLength: 8, maxLength: 8, xPath: "/drugbank/drug/pathways/pathway/smpdb-id", parent.name: "pathway"}
| | | # Node{name: "snp-effects", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/snp-effects", parent.name: "drug"}
| | | | # Node{name: "effect", count: 211 (1.9%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/snp-effects/effect", parent.name: "snp-effects"}
| | | | | # Node{name: "pubmed-id", count: 211 (100%), valueCount: 188 (89.1%), minLength: 7, maxLength: 8, xPath: "/drugbank/drug/snp-effects/effect/pubmed-id", parent.name: "effect"}
| | | | | # Node{name: "protein-name", count: 211 (100%), valueCount: 211 (100%), minLength: 15, maxLength: 64, xPath: "/drugbank/drug/snp-effects/effect/protein-name", parent.name: "effect"}
| | | | | # Node{name: "uniprot-id", count: 211 (100%), valueCount: 211 (100%), minLength: 6, maxLength: 6, xPath: "/drugbank/drug/snp-effects/effect/uniprot-id", parent.name: "effect"}
| | | | | # Node{name: "allele", count: 211 (100%), valueCount: 152 (72%), minLength: 5, maxLength: 22, xPath: "/drugbank/drug/snp-effects/effect/allele", parent.name: "effect"}
| | | | | # Node{name: "description", count: 211 (100%), valueCount: 211 (100%), minLength: 22, maxLength: 195, xPath: "/drugbank/drug/snp-effects/effect/description", parent.name: "effect"}
| | | | | # Node{name: "rs-id", count: 211 (100%), valueCount: 194 (91.9%), minLength: 6, maxLength: 11, xPath: "/drugbank/drug/snp-effects/effect/rs-id", parent.name: "effect"}
| | | | | # Node{name: "gene-symbol", count: 211 (100%), valueCount: 211 (100%), minLength: 3, maxLength: 7, xPath: "/drugbank/drug/snp-effects/effect/gene-symbol", parent.name: "effect"}
| | | | | # Node{name: "defining-change", count: 211 (100%), valueCount: 349 (165.4%), minLength: 1, maxLength: 31, xPath: "/drugbank/drug/snp-effects/effect/defining-change", parent.name: "effect"}
| | | # Node{name: "carriers", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers", parent.name: "drug"}
| | | | # Node{name: "carrier", count: 482 (4.4%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier", parent.name: "carriers"}
| | | | | * Attribute{name: "position", count: 407 (84.4%), valueCount: 407 (100%), minLength: 1, maxLength: 2, xPath: "/drugbank/drug/carriers/carrier/@position", parent.name: "carrier"}
| | | | | # Node{name: "polypeptide", count: 498 (103.3%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/polypeptide", parent.name: "carrier"}
| | | | | | * Attribute{name: "id", count: 498 (100%), valueCount: 498 (100%), minLength: 6, maxLength: 6, xPath: "/drugbank/drug/carriers/carrier/polypeptide/@id", parent.name: "polypeptide"}
| | | | | | * Attribute{name: "source", count: 498 (100%), valueCount: 498 (100%), minLength: 10, maxLength: 10, xPath: "/drugbank/drug/carriers/carrier/polypeptide/@source", parent.name: "polypeptide"}
| | | | | | # Node{name: "external-identifiers", count: 498 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/polypeptide/external-identifiers", parent.name: "polypeptide"}
| | | | | | | # Node{name: "external-identifier", count: 2947 (591.8%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/polypeptide/external-identifiers/external-identifier", parent.name: "external-identifiers"}
| | | | | | | | # Node{name: "identifier", count: 2947 (100%), valueCount: 2947 (100%), minLength: 2, maxLength: 11, xPath: "/drugbank/drug/carriers/carrier/polypeptide/external-identifiers/external-identifier/identifier", parent.name: "external-identifier"}
| | | | | | | | # Node{name: "resource", count: 2947 (100%), valueCount: 2947 (100%), minLength: 8, maxLength: 39, xPath: "/drugbank/drug/carriers/carrier/polypeptide/external-identifiers/external-identifier/resource", parent.name: "external-identifier"}
| | | | | | # Node{name: "theoretical-pi", count: 498 (100%), valueCount: 470 (94.4%), minLength: 3, maxLength: 4, xPath: "/drugbank/drug/carriers/carrier/polypeptide/theoretical-pi", parent.name: "polypeptide"}
| | | | | | # Node{name: "organism", count: 498 (100%), valueCount: 498 (100%), minLength: 5, maxLength: 5, xPath: "/drugbank/drug/carriers/carrier/polypeptide/organism", parent.name: "polypeptide"}
| | | | | | | * Attribute{name: "ncbi-taxonomy-id", count: 498 (100%), valueCount: 498 (100%), minLength: 4, maxLength: 4, xPath: "/drugbank/drug/carriers/carrier/polypeptide/organism/@ncbi-taxonomy-id", parent.name: "organism"}
| | | | | | # Node{name: "molecular-weight", count: 498 (100%), valueCount: 498 (100%), minLength: 7, maxLength: 10, xPath: "/drugbank/drug/carriers/carrier/polypeptide/molecular-weight", parent.name: "polypeptide"}
| | | | | | # Node{name: "synonyms", count: 498 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/polypeptide/synonyms", parent.name: "polypeptide"}
| | | | | | | # Node{name: "synonym", count: 1411 (283.3%), valueCount: 1411 (100%), minLength: 2, maxLength: 65, xPath: "/drugbank/drug/carriers/carrier/polypeptide/synonyms/synonym", parent.name: "synonyms"}
| | | | | | # Node{name: "general-function", count: 498 (100%), valueCount: 439 (88.2%), minLength: 15, maxLength: 249, xPath: "/drugbank/drug/carriers/carrier/polypeptide/general-function", parent.name: "polypeptide"}
| | | | | | # Node{name: "pfams", count: 498 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/polypeptide/pfams", parent.name: "polypeptide"}
| | | | | | | # Node{name: "pfam", count: 548 (110%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/polypeptide/pfams/pfam", parent.name: "pfams"}
| | | | | | | | # Node{name: "identifier", count: 548 (100%), valueCount: 548 (100%), minLength: 7, maxLength: 7, xPath: "/drugbank/drug/carriers/carrier/polypeptide/pfams/pfam/identifier", parent.name: "pfam"}
| | | | | | | | # Node{name: "name", count: 548 (100%), valueCount: 548 (100%), minLength: 2, maxLength: 15, xPath: "/drugbank/drug/carriers/carrier/polypeptide/pfams/pfam/name", parent.name: "pfam"}
| | | | | | # Node{name: "gene-name", count: 498 (100%), valueCount: 498 (100%), minLength: 2, maxLength: 8, xPath: "/drugbank/drug/carriers/carrier/polypeptide/gene-name", parent.name: "polypeptide"}
| | | | | | # Node{name: "amino-acid-sequence", count: 498 (100%), valueCount: 2853 (572.9%), minLength: 1, maxLength: 142, xPath: "/drugbank/drug/carriers/carrier/polypeptide/amino-acid-sequence", parent.name: "polypeptide"}
| | | | | | | * Attribute{name: "format", count: 498 (100%), valueCount: 498 (100%), minLength: 5, maxLength: 5, xPath: "/drugbank/drug/carriers/carrier/polypeptide/amino-acid-sequence/@format", parent.name: "amino-acid-sequence"}
| | | | | | # Node{name: "specific-function", count: 498 (100%), valueCount: 496 (99.6%), minLength: 16, maxLength: 1278, xPath: "/drugbank/drug/carriers/carrier/polypeptide/specific-function", parent.name: "polypeptide"}
| | | | | | # Node{name: "name", count: 498 (100%), valueCount: 498 (100%), minLength: 6, maxLength: 65, xPath: "/drugbank/drug/carriers/carrier/polypeptide/name", parent.name: "polypeptide"}
| | | | | | # Node{name: "transmembrane-regions", count: 498 (100%), valueCount: 88 (17.7%), minLength: 5, maxLength: 16, xPath: "/drugbank/drug/carriers/carrier/polypeptide/transmembrane-regions", parent.name: "polypeptide"}
| | | | | | # Node{name: "locus", count: 498 (100%), valueCount: 481 (96.6%), minLength: 4, maxLength: 13, xPath: "/drugbank/drug/carriers/carrier/polypeptide/locus", parent.name: "polypeptide"}
| | | | | | # Node{name: "signal-regions", count: 498 (100%), valueCount: 406 (81.5%), minLength: 4, maxLength: 4, xPath: "/drugbank/drug/carriers/carrier/polypeptide/signal-regions", parent.name: "polypeptide"}
| | | | | | # Node{name: "gene-sequence", count: 498 (100%), valueCount: 6519 (1309%), minLength: 1, maxLength: 151, xPath: "/drugbank/drug/carriers/carrier/polypeptide/gene-sequence", parent.name: "polypeptide"}
| | | | | | | * Attribute{name: "format", count: 498 (100%), valueCount: 498 (100%), minLength: 5, maxLength: 5, xPath: "/drugbank/drug/carriers/carrier/polypeptide/gene-sequence/@format", parent.name: "gene-sequence"}
| | | | | | # Node{name: "go-classifiers", count: 498 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/polypeptide/go-classifiers", parent.name: "polypeptide"}
| | | | | | | # Node{name: "go-classifier", count: 11575 (2324.3%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/polypeptide/go-classifiers/go-classifier", parent.name: "go-classifiers"}
| | | | | | | | # Node{name: "description", count: 11575 (100%), valueCount: 11575 (100%), minLength: 4, maxLength: 101, xPath: "/drugbank/drug/carriers/carrier/polypeptide/go-classifiers/go-classifier/description", parent.name: "go-classifier"}
| | | | | | | | # Node{name: "category", count: 11575 (100%), valueCount: 11575 (100%), minLength: 7, maxLength: 9, xPath: "/drugbank/drug/carriers/carrier/polypeptide/go-classifiers/go-classifier/category", parent.name: "go-classifier"}
| | | | | | # Node{name: "cellular-location", count: 498 (100%), valueCount: 479 (96.2%), minLength: 7, maxLength: 33, xPath: "/drugbank/drug/carriers/carrier/polypeptide/cellular-location", parent.name: "polypeptide"}
| | | | | | # Node{name: "chromosome-location", count: 498 (100%), valueCount: 494 (99.2%), minLength: 1, maxLength: 2, xPath: "/drugbank/drug/carriers/carrier/polypeptide/chromosome-location", parent.name: "polypeptide"}
| | | | | # Node{name: "organism", count: 482 (100%), valueCount: 482 (100%), minLength: 5, maxLength: 12, xPath: "/drugbank/drug/carriers/carrier/organism", parent.name: "carrier"}
| | | | | # Node{name: "references", count: 482 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/references", parent.name: "carrier"}
| | | | | | # Node{name: "links", count: 482 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/references/links", parent.name: "references"}
| | | | | | | # Node{name: "link", count: 22 (4.6%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/references/links/link", parent.name: "links"}
| | | | | | | | # Node{name: "title", count: 22 (100%), valueCount: 22 (100%), minLength: 4, maxLength: 70, xPath: "/drugbank/drug/carriers/carrier/references/links/link/title", parent.name: "link"}
| | | | | | | | # Node{name: "url", count: 22 (100%), valueCount: 22 (100%), minLength: 42, maxLength: 152, xPath: "/drugbank/drug/carriers/carrier/references/links/link/url", parent.name: "link"}
| | | | | | # Node{name: "articles", count: 482 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/references/articles", parent.name: "references"}
| | | | | | | # Node{name: "article", count: 736 (152.7%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/references/articles/article", parent.name: "articles"}
| | | | | | | | # Node{name: "pubmed-id", count: 736 (100%), valueCount: 736 (100%), minLength: 6, maxLength: 8, xPath: "/drugbank/drug/carriers/carrier/references/articles/article/pubmed-id", parent.name: "article"}
| | | | | | | | # Node{name: "citation", count: 736 (100%), valueCount: 736 (100%), minLength: 57, maxLength: 445, xPath: "/drugbank/drug/carriers/carrier/references/articles/article/citation", parent.name: "article"}
| | | | | | # Node{name: "textbooks", count: 482 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/references/textbooks", parent.name: "references"}
| | | | | | | # Node{name: "textbook", count: 8 (1.7%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/references/textbooks/textbook", parent.name: "textbooks"}
| | | | | | | | # Node{name: "citation", count: 8 (100%), valueCount: 8 (100%), minLength: 54, maxLength: 127, xPath: "/drugbank/drug/carriers/carrier/references/textbooks/textbook/citation", parent.name: "textbook"}
| | | | | | | | # Node{name: "isbn", count: 8 (100%), valueCount: 2 (25%), minLength: 16, maxLength: 16, xPath: "/drugbank/drug/carriers/carrier/references/textbooks/textbook/isbn", parent.name: "textbook"}
| | | | | # Node{name: "known-action", count: 482 (100%), valueCount: 482 (100%), minLength: 2, maxLength: 7, xPath: "/drugbank/drug/carriers/carrier/known-action", parent.name: "carrier"}
| | | | | # Node{name: "name", count: 482 (100%), valueCount: 482 (100%), minLength: 9, maxLength: 65, xPath: "/drugbank/drug/carriers/carrier/name", parent.name: "carrier"}
| | | | | # Node{name: "id", count: 482 (100%), valueCount: 482 (100%), minLength: 9, maxLength: 9, xPath: "/drugbank/drug/carriers/carrier/id", parent.name: "carrier"}
| | | | | # Node{name: "actions", count: 482 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/carriers/carrier/actions", parent.name: "carrier"}
| | | | | | # Node{name: "action", count: 188 (39%), valueCount: 188 (100%), minLength: 6, maxLength: 13, xPath: "/drugbank/drug/carriers/carrier/actions/action", parent.name: "actions"}
| | | # Node{name: "classification", count: 9300 (84.3%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/classification", parent.name: "drug"}
| | | | # Node{name: "direct-parent", count: 9300 (100%), valueCount: 9358 (100.6%), minLength: 1, maxLength: 60, xPath: "/drugbank/drug/classification/direct-parent", parent.name: "classification"}
| | | | # Node{name: "alternative-parent", count: 112263 (1207.1%), valueCount: 112282 (100%), minLength: 1, maxLength: 54, xPath: "/drugbank/drug/classification/alternative-parent", parent.name: "classification"}
| | | | # Node{name: "superclass", count: 9300 (100%), valueCount: 9299 (100%), minLength: 10, maxLength: 41, xPath: "/drugbank/drug/classification/superclass", parent.name: "classification"}
| | | | # Node{name: "subclass", count: 9300 (100%), valueCount: 7950 (85.5%), minLength: 1, maxLength: 48, xPath: "/drugbank/drug/classification/subclass", parent.name: "classification"}
| | | | # Node{name: "description", count: 9300 (100%), valueCount: 8939 (96.1%), minLength: 1, maxLength: 620, xPath: "/drugbank/drug/classification/description", parent.name: "classification"}
| | | | # Node{name: "kingdom", count: 9300 (100%), valueCount: 9300 (100%), minLength: 17, maxLength: 19, xPath: "/drugbank/drug/classification/kingdom", parent.name: "classification"}
| | | | # Node{name: "class", count: 9300 (100%), valueCount: 9334 (100.4%), minLength: 1, maxLength: 60, xPath: "/drugbank/drug/classification/class", parent.name: "classification"}
| | | | # Node{name: "substituent", count: 210722 (2265.8%), valueCount: 210805 (100%), minLength: 1, maxLength: 66, xPath: "/drugbank/drug/classification/substituent", parent.name: "classification"}
| | | # Node{name: "half-life", count: 11033 (100%), valueCount: 2322 (21%), minLength: 1, maxLength: 532, xPath: "/drugbank/drug/half-life", parent.name: "drug"}
| | | # Node{name: "monoisotopic-mass", count: 9100 (82.5%), valueCount: 9100 (100%), minLength: 4, maxLength: 14, xPath: "/drugbank/drug/monoisotopic-mass", parent.name: "drug"}
| | | # Node{name: "volume-of-distribution", count: 11033 (100%), valueCount: 1161 (10.5%), minLength: 1, maxLength: 590, xPath: "/drugbank/drug/volume-of-distribution", parent.name: "drug"}
| | | # Node{name: "route-of-elimination", count: 11033 (100%), valueCount: 1631 (14.8%), minLength: 1, maxLength: 797, xPath: "/drugbank/drug/route-of-elimination", parent.name: "drug"}
| | | # Node{name: "name", count: 11033 (100%), valueCount: 11522 (104.4%), minLength: 1, maxLength: 221, xPath: "/drugbank/drug/name", parent.name: "drug"}
| | | # Node{name: "metabolism", count: 11033 (100%), valueCount: 2565 (23.2%), minLength: 1, maxLength: 1379, xPath: "/drugbank/drug/metabolism", parent.name: "drug"}
| | | # Node{name: "indication", count: 11033 (100%), valueCount: 6927 (62.8%), minLength: 1, maxLength: 1898, xPath: "/drugbank/drug/indication", parent.name: "drug"}
| | | # Node{name: "affected-organisms", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/affected-organisms", parent.name: "drug"}
| | | | # Node{name: "affected-organism", count: 2642 (23.9%), valueCount: 2642 (100%), minLength: 5, maxLength: 74, xPath: "/drugbank/drug/affected-organisms/affected-organism", parent.name: "affected-organisms"}
| | | # Node{name: "experimental-properties", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/experimental-properties", parent.name: "drug"}
| | | | # Node{name: "property", count: 6084 (55.1%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/experimental-properties/property", parent.name: "experimental-properties"}
| | | | | # Node{name: "kind", count: 6084 (100%), valueCount: 6084 (100%), minLength: 3, maxLength: 18, xPath: "/drugbank/drug/experimental-properties/property/kind", parent.name: "property"}
| | | | | # Node{name: "source", count: 6084 (100%), valueCount: 5003 (82.2%), minLength: 1, maxLength: 357, xPath: "/drugbank/drug/experimental-properties/property/source", parent.name: "property"}
| | | | | # Node{name: "value", count: 6084 (100%), valueCount: 6200 (101.9%), minLength: 1, maxLength: 240, xPath: "/drugbank/drug/experimental-properties/property/value", parent.name: "property"}
| | | # Node{name: "external-identifiers", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/external-identifiers", parent.name: "drug"}
| | | | # Node{name: "external-identifier", count: 62926 (570.3%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/external-identifiers/external-identifier", parent.name: "external-identifiers"}
| | | | | # Node{name: "identifier", count: 62926 (100%), valueCount: 62926 (100%), minLength: 1, maxLength: 76, xPath: "/drugbank/drug/external-identifiers/external-identifier/identifier", parent.name: "external-identifier"}
| | | | | # Node{name: "resource", count: 62926 (100%), valueCount: 62926 (100%), minLength: 3, maxLength: 28, xPath: "/drugbank/drug/external-identifiers/external-identifier/resource", parent.name: "external-identifier"}
| | | # Node{name: "transporters", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters", parent.name: "drug"}
| | | | # Node{name: "transporter", count: 2184 (19.8%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter", parent.name: "transporters"}
| | | | | * Attribute{name: "position", count: 2184 (100%), valueCount: 2184 (100%), minLength: 1, maxLength: 2, xPath: "/drugbank/drug/transporters/transporter/@position", parent.name: "transporter"}
| | | | | # Node{name: "polypeptide", count: 2203 (100.9%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/polypeptide", parent.name: "transporter"}
| | | | | | * Attribute{name: "id", count: 2203 (100%), valueCount: 2203 (100%), minLength: 6, maxLength: 6, xPath: "/drugbank/drug/transporters/transporter/polypeptide/@id", parent.name: "polypeptide"}
| | | | | | * Attribute{name: "source", count: 2203 (100%), valueCount: 2203 (100%), minLength: 6, maxLength: 10, xPath: "/drugbank/drug/transporters/transporter/polypeptide/@source", parent.name: "polypeptide"}
| | | | | | # Node{name: "external-identifiers", count: 2203 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/polypeptide/external-identifiers", parent.name: "polypeptide"}
| | | | | | | # Node{name: "external-identifier", count: 13333 (605.2%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/polypeptide/external-identifiers/external-identifier", parent.name: "external-identifiers"}
| | | | | | | | # Node{name: "identifier", count: 13333 (100%), valueCount: 13333 (100%), minLength: 2, maxLength: 12, xPath: "/drugbank/drug/transporters/transporter/polypeptide/external-identifiers/external-identifier/identifier", parent.name: "external-identifier"}
| | | | | | | | # Node{name: "resource", count: 13333 (100%), valueCount: 13333 (100%), minLength: 6, maxLength: 39, xPath: "/drugbank/drug/transporters/transporter/polypeptide/external-identifiers/external-identifier/resource", parent.name: "external-identifier"}
| | | | | | # Node{name: "theoretical-pi", count: 2203 (100%), valueCount: 2075 (94.2%), minLength: 3, maxLength: 4, xPath: "/drugbank/drug/transporters/transporter/polypeptide/theoretical-pi", parent.name: "polypeptide"}
| | | | | | # Node{name: "organism", count: 2203 (100%), valueCount: 2203 (100%), minLength: 5, maxLength: 29, xPath: "/drugbank/drug/transporters/transporter/polypeptide/organism", parent.name: "polypeptide"}
| | | | | | | * Attribute{name: "ncbi-taxonomy-id", count: 2203 (100%), valueCount: 2203 (100%), minLength: 3, maxLength: 5, xPath: "/drugbank/drug/transporters/transporter/polypeptide/organism/@ncbi-taxonomy-id", parent.name: "organism"}
| | | | | | # Node{name: "molecular-weight", count: 2203 (100%), valueCount: 2203 (100%), minLength: 7, maxLength: 10, xPath: "/drugbank/drug/transporters/transporter/polypeptide/molecular-weight", parent.name: "polypeptide"}
| | | | | | # Node{name: "synonyms", count: 2203 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/polypeptide/synonyms", parent.name: "polypeptide"}
| | | | | | | # Node{name: "synonym", count: 12850 (583.3%), valueCount: 12850 (100%), minLength: 2, maxLength: 83, xPath: "/drugbank/drug/transporters/transporter/polypeptide/synonyms/synonym", parent.name: "synonyms"}
| | | | | | # Node{name: "general-function", count: 2203 (100%), valueCount: 2197 (99.7%), minLength: 12, maxLength: 802, xPath: "/drugbank/drug/transporters/transporter/polypeptide/general-function", parent.name: "polypeptide"}
| | | | | | # Node{name: "pfams", count: 2203 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/polypeptide/pfams", parent.name: "polypeptide"}
| | | | | | | # Node{name: "pfam", count: 3467 (157.4%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/polypeptide/pfams/pfam", parent.name: "pfams"}
| | | | | | | | # Node{name: "identifier", count: 3467 (100%), valueCount: 3467 (100%), minLength: 7, maxLength: 7, xPath: "/drugbank/drug/transporters/transporter/polypeptide/pfams/pfam/identifier", parent.name: "pfam"}
| | | | | | | | # Node{name: "name", count: 3467 (100%), valueCount: 3467 (100%), minLength: 2, maxLength: 15, xPath: "/drugbank/drug/transporters/transporter/polypeptide/pfams/pfam/name", parent.name: "pfam"}
| | | | | | # Node{name: "gene-name", count: 2203 (100%), valueCount: 2202 (100%), minLength: 2, maxLength: 8, xPath: "/drugbank/drug/transporters/transporter/polypeptide/gene-name", parent.name: "polypeptide"}
| | | | | | # Node{name: "amino-acid-sequence", count: 2203 (100%), valueCount: 20600 (935.1%), minLength: 1, maxLength: 154, xPath: "/drugbank/drug/transporters/transporter/polypeptide/amino-acid-sequence", parent.name: "polypeptide"}
| | | | | | | * Attribute{name: "format", count: 2203 (100%), valueCount: 2203 (100%), minLength: 5, maxLength: 5, xPath: "/drugbank/drug/transporters/transporter/polypeptide/amino-acid-sequence/@format", parent.name: "amino-acid-sequence"}
| | | | | | # Node{name: "specific-function", count: 2203 (100%), valueCount: 2218 (100.7%), minLength: 1, maxLength: 1466, xPath: "/drugbank/drug/transporters/transporter/polypeptide/specific-function", parent.name: "polypeptide"}
| | | | | | # Node{name: "name", count: 2203 (100%), valueCount: 2203 (100%), minLength: 7, maxLength: 77, xPath: "/drugbank/drug/transporters/transporter/polypeptide/name", parent.name: "polypeptide"}
| | | | | | # Node{name: "transmembrane-regions", count: 2203 (100%), valueCount: 13127 (595.9%), minLength: 5, maxLength: 19, xPath: "/drugbank/drug/transporters/transporter/polypeptide/transmembrane-regions", parent.name: "polypeptide"}
| | | | | | # Node{name: "locus", count: 2203 (100%), valueCount: 1950 (88.5%), minLength: 3, maxLength: 17, xPath: "/drugbank/drug/transporters/transporter/polypeptide/locus", parent.name: "polypeptide"}
| | | | | | # Node{name: "signal-regions", count: 2203 (100%), valueCount: 21 (1%), minLength: 4, maxLength: 4, xPath: "/drugbank/drug/transporters/transporter/polypeptide/signal-regions", parent.name: "polypeptide"}
| | | | | | # Node{name: "gene-sequence", count: 2203 (100%), valueCount: 49800 (2260.6%), minLength: 1, maxLength: 164, xPath: "/drugbank/drug/transporters/transporter/polypeptide/gene-sequence", parent.name: "polypeptide"}
| | | | | | | * Attribute{name: "format", count: 2203 (100%), valueCount: 2203 (100%), minLength: 5, maxLength: 5, xPath: "/drugbank/drug/transporters/transporter/polypeptide/gene-sequence/@format", parent.name: "gene-sequence"}
| | | | | | # Node{name: "go-classifiers", count: 2203 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/polypeptide/go-classifiers", parent.name: "polypeptide"}
| | | | | | | # Node{name: "go-classifier", count: 35104 (1593.5%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/polypeptide/go-classifiers/go-classifier", parent.name: "go-classifiers"}
| | | | | | | | # Node{name: "description", count: 35104 (100%), valueCount: 35104 (100%), minLength: 4, maxLength: 116, xPath: "/drugbank/drug/transporters/transporter/polypeptide/go-classifiers/go-classifier/description", parent.name: "go-classifier"}
| | | | | | | | # Node{name: "category", count: 35104 (100%), valueCount: 35104 (100%), minLength: 7, maxLength: 9, xPath: "/drugbank/drug/transporters/transporter/polypeptide/go-classifiers/go-classifier/category", parent.name: "go-classifier"}
| | | | | | # Node{name: "cellular-location", count: 2203 (100%), valueCount: 2195 (99.6%), minLength: 8, maxLength: 31, xPath: "/drugbank/drug/transporters/transporter/polypeptide/cellular-location", parent.name: "polypeptide"}
| | | | | | # Node{name: "chromosome-location", count: 2203 (100%), valueCount: 2175 (98.7%), minLength: 1, maxLength: 2, xPath: "/drugbank/drug/transporters/transporter/polypeptide/chromosome-location", parent.name: "polypeptide"}
| | | | | # Node{name: "organism", count: 2184 (100%), valueCount: 2184 (100%), minLength: 5, maxLength: 29, xPath: "/drugbank/drug/transporters/transporter/organism", parent.name: "transporter"}
| | | | | # Node{name: "references", count: 2184 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/references", parent.name: "transporter"}
| | | | | | # Node{name: "links", count: 2184 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/references/links", parent.name: "references"}
| | | | | | | # Node{name: "link", count: 78 (3.6%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/references/links/link", parent.name: "links"}
| | | | | | | | # Node{name: "title", count: 78 (100%), valueCount: 78 (100%), minLength: 4, maxLength: 114, xPath: "/drugbank/drug/transporters/transporter/references/links/link/title", parent.name: "link"}
| | | | | | | | # Node{name: "url", count: 78 (100%), valueCount: 78 (100%), minLength: 37, maxLength: 159, xPath: "/drugbank/drug/transporters/transporter/references/links/link/url", parent.name: "link"}
| | | | | | # Node{name: "articles", count: 2184 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/references/articles", parent.name: "references"}
| | | | | | | # Node{name: "article", count: 3639 (166.6%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/references/articles/article", parent.name: "articles"}
| | | | | | | | # Node{name: "pubmed-id", count: 3639 (100%), valueCount: 3639 (100%), minLength: 7, maxLength: 8, xPath: "/drugbank/drug/transporters/transporter/references/articles/article/pubmed-id", parent.name: "article"}
| | | | | | | | # Node{name: "citation", count: 3639 (100%), valueCount: 3660 (100.6%), minLength: 1, maxLength: 643, xPath: "/drugbank/drug/transporters/transporter/references/articles/article/citation", parent.name: "article"}
| | | | | | # Node{name: "textbooks", count: 2184 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/references/textbooks", parent.name: "references"}
| | | | | | | # Node{name: "textbook", count: 9 (0.4%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/references/textbooks/textbook", parent.name: "textbooks"}
| | | | | | | | # Node{name: "citation", count: 9 (100%), valueCount: 9 (100%), minLength: 66, maxLength: 95, xPath: "/drugbank/drug/transporters/transporter/references/textbooks/textbook/citation", parent.name: "textbook"}
| | | | | | | | # Node{name: "isbn", count: 9 (100%), valueCount: 2 (22.2%), minLength: 17, maxLength: 17, xPath: "/drugbank/drug/transporters/transporter/references/textbooks/textbook/isbn", parent.name: "textbook"}
| | | | | # Node{name: "known-action", count: 2184 (100%), valueCount: 2184 (100%), minLength: 2, maxLength: 7, xPath: "/drugbank/drug/transporters/transporter/known-action", parent.name: "transporter"}
| | | | | # Node{name: "name", count: 2184 (100%), valueCount: 2184 (100%), minLength: 7, maxLength: 77, xPath: "/drugbank/drug/transporters/transporter/name", parent.name: "transporter"}
| | | | | # Node{name: "id", count: 2184 (100%), valueCount: 2184 (100%), minLength: 9, maxLength: 9, xPath: "/drugbank/drug/transporters/transporter/id", parent.name: "transporter"}
| | | | | # Node{name: "actions", count: 2184 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/transporters/transporter/actions", parent.name: "transporter"}
| | | | | | # Node{name: "action", count: 2350 (107.6%), valueCount: 2350 (100%), minLength: 5, maxLength: 14, xPath: "/drugbank/drug/transporters/transporter/actions/action", parent.name: "actions"}
| | | # Node{name: "dosages", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/dosages", parent.name: "drug"}
| | | | # Node{name: "dosage", count: 33896 (307.2%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/dosages/dosage", parent.name: "dosages"}
| | | | | # Node{name: "route", count: 33896 (100%), valueCount: 33437 (98.6%), minLength: 4, maxLength: 118, xPath: "/drugbank/drug/dosages/dosage/route", parent.name: "dosage"}
| | | | | # Node{name: "form", count: 33896 (100%), valueCount: 33863 (99.9%), minLength: 3, maxLength: 62, xPath: "/drugbank/drug/dosages/dosage/form", parent.name: "dosage"}
| | | | | # Node{name: "strength", count: 33896 (100%), valueCount: 27510 (81.2%), minLength: 3, maxLength: 36, xPath: "/drugbank/drug/dosages/dosage/strength", parent.name: "dosage"}
| | | # Node{name: "description", count: 11033 (100%), valueCount: 8376 (75.9%), minLength: 1, maxLength: 1870, xPath: "/drugbank/drug/description", parent.name: "drug"}
| | | # Node{name: "enzymes", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes", parent.name: "drug"}
| | | | # Node{name: "enzyme", count: 4280 (38.8%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme", parent.name: "enzymes"}
| | | | | * Attribute{name: "position", count: 3362 (78.6%), valueCount: 3362 (100%), minLength: 1, maxLength: 3, xPath: "/drugbank/drug/enzymes/enzyme/@position", parent.name: "enzyme"}
| | | | | # Node{name: "polypeptide", count: 4307 (100.6%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide", parent.name: "enzyme"}
| | | | | | * Attribute{name: "id", count: 4307 (100%), valueCount: 4307 (100%), minLength: 6, maxLength: 10, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/@id", parent.name: "polypeptide"}
| | | | | | * Attribute{name: "source", count: 4307 (100%), valueCount: 4307 (100%), minLength: 6, maxLength: 10, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/@source", parent.name: "polypeptide"}
| | | | | | # Node{name: "external-identifiers", count: 4307 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/external-identifiers", parent.name: "polypeptide"}
| | | | | | | # Node{name: "external-identifier", count: 25918 (601.8%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/external-identifiers/external-identifier", parent.name: "external-identifiers"}
| | | | | | | | # Node{name: "identifier", count: 25918 (100%), valueCount: 25918 (100%), minLength: 2, maxLength: 16, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/external-identifiers/external-identifier/identifier", parent.name: "external-identifier"}
| | | | | | | | # Node{name: "resource", count: 25918 (100%), valueCount: 25918 (100%), minLength: 8, maxLength: 39, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/external-identifiers/external-identifier/resource", parent.name: "external-identifier"}
| | | | | | # Node{name: "theoretical-pi", count: 4307 (100%), valueCount: 4201 (97.5%), minLength: 3, maxLength: 5, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/theoretical-pi", parent.name: "polypeptide"}
| | | | | | # Node{name: "organism", count: 4307 (100%), valueCount: 4307 (100%), minLength: 3, maxLength: 103, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/organism", parent.name: "polypeptide"}
| | | | | | | * Attribute{name: "ncbi-taxonomy-id", count: 4307 (100%), valueCount: 4307 (100%), minLength: 3, maxLength: 6, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/organism/@ncbi-taxonomy-id", parent.name: "organism"}
| | | | | | # Node{name: "molecular-weight", count: 4307 (100%), valueCount: 4307 (100%), minLength: 7, maxLength: 10, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/molecular-weight", parent.name: "polypeptide"}
| | | | | | # Node{name: "synonyms", count: 4307 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/synonyms", parent.name: "polypeptide"}
| | | | | | | # Node{name: "synonym", count: 33210 (771.1%), valueCount: 33218 (100%), minLength: 1, maxLength: 81, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/synonyms/synonym", parent.name: "synonyms"}
| | | | | | # Node{name: "general-function", count: 4307 (100%), valueCount: 4310 (100.1%), minLength: 1, maxLength: 914, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/general-function", parent.name: "polypeptide"}
| | | | | | # Node{name: "pfams", count: 4307 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/pfams", parent.name: "polypeptide"}
| | | | | | | # Node{name: "pfam", count: 4940 (114.7%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/pfams/pfam", parent.name: "pfams"}
| | | | | | | | # Node{name: "identifier", count: 4940 (100%), valueCount: 4940 (100%), minLength: 7, maxLength: 7, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/pfams/pfam/identifier", parent.name: "pfam"}
| | | | | | | | # Node{name: "name", count: 4940 (100%), valueCount: 4940 (100%), minLength: 2, maxLength: 15, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/pfams/pfam/name", parent.name: "pfam"}
| | | | | | # Node{name: "gene-name", count: 4307 (100%), valueCount: 4306 (100%), minLength: 2, maxLength: 8, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/gene-name", parent.name: "polypeptide"}
| | | | | | # Node{name: "amino-acid-sequence", count: 4307 (100%), valueCount: 26456 (614.3%), minLength: 1, maxLength: 144, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/amino-acid-sequence", parent.name: "polypeptide"}
| | | | | | | * Attribute{name: "format", count: 4307 (100%), valueCount: 4307 (100%), minLength: 5, maxLength: 5, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/amino-acid-sequence/@format", parent.name: "amino-acid-sequence"}
| | | | | | # Node{name: "specific-function", count: 4307 (100%), valueCount: 4253 (98.7%), minLength: 1, maxLength: 1716, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/specific-function", parent.name: "polypeptide"}
| | | | | | # Node{name: "name", count: 4307 (100%), valueCount: 4315 (100.2%), minLength: 1, maxLength: 68, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/name", parent.name: "polypeptide"}
| | | | | | # Node{name: "transmembrane-regions", count: 4307 (100%), valueCount: 1124 (26.1%), minLength: 4, maxLength: 15, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/transmembrane-regions", parent.name: "polypeptide"}
| | | | | | # Node{name: "locus", count: 4307 (100%), valueCount: 4166 (96.7%), minLength: 1, maxLength: 24, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/locus", parent.name: "polypeptide"}
| | | | | | # Node{name: "signal-regions", count: 4307 (100%), valueCount: 482 (11.2%), minLength: 2, maxLength: 4, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/signal-regions", parent.name: "polypeptide"}
| | | | | | # Node{name: "gene-sequence", count: 4307 (100%), valueCount: 63275 (1469.1%), minLength: 1, maxLength: 153, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/gene-sequence", parent.name: "polypeptide"}
| | | | | | | * Attribute{name: "format", count: 4307 (100%), valueCount: 4307 (100%), minLength: 5, maxLength: 5, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/gene-sequence/@format", parent.name: "gene-sequence"}
| | | | | | # Node{name: "go-classifiers", count: 4307 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/go-classifiers", parent.name: "polypeptide"}
| | | | | | | # Node{name: "go-classifier", count: 120240 (2791.7%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/go-classifiers/go-classifier", parent.name: "go-classifiers"}
| | | | | | | | # Node{name: "description", count: 120240 (100%), valueCount: 120240 (100%), minLength: 4, maxLength: 193, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/go-classifiers/go-classifier/description", parent.name: "go-classifier"}
| | | | | | | | # Node{name: "category", count: 120240 (100%), valueCount: 120240 (100%), minLength: 7, maxLength: 9, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/go-classifiers/go-classifier/category", parent.name: "go-classifier"}
| | | | | | # Node{name: "cellular-location", count: 4307 (100%), valueCount: 4210 (97.7%), minLength: 7, maxLength: 33, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/cellular-location", parent.name: "polypeptide"}
| | | | | | # Node{name: "chromosome-location", count: 4307 (100%), valueCount: 4247 (98.6%), minLength: 1, maxLength: 4, xPath: "/drugbank/drug/enzymes/enzyme/polypeptide/chromosome-location", parent.name: "polypeptide"}
| | | | | # Node{name: "inhibition-strength", count: 4280 (100%), valueCount: 4280 (100%), minLength: 4, maxLength: 8, xPath: "/drugbank/drug/enzymes/enzyme/inhibition-strength", parent.name: "enzyme"}
| | | | | # Node{name: "organism", count: 4280 (100%), valueCount: 4275 (99.9%), minLength: 3, maxLength: 103, xPath: "/drugbank/drug/enzymes/enzyme/organism", parent.name: "enzyme"}
| | | | | # Node{name: "references", count: 4280 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/references", parent.name: "enzyme"}
| | | | | | # Node{name: "links", count: 4280 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/references/links", parent.name: "references"}
| | | | | | | # Node{name: "link", count: 743 (17.4%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/references/links/link", parent.name: "links"}
| | | | | | | | # Node{name: "title", count: 743 (100%), valueCount: 743 (100%), minLength: 4, maxLength: 145, xPath: "/drugbank/drug/enzymes/enzyme/references/links/link/title", parent.name: "link"}
| | | | | | | | # Node{name: "url", count: 743 (100%), valueCount: 807 (108.6%), minLength: 1, maxLength: 655, xPath: "/drugbank/drug/enzymes/enzyme/references/links/link/url", parent.name: "link"}
| | | | | | # Node{name: "articles", count: 4280 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/references/articles", parent.name: "references"}
| | | | | | | # Node{name: "article", count: 5249 (122.6%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/references/articles/article", parent.name: "articles"}
| | | | | | | | # Node{name: "pubmed-id", count: 5249 (100%), valueCount: 5245 (99.9%), minLength: 4, maxLength: 8, xPath: "/drugbank/drug/enzymes/enzyme/references/articles/article/pubmed-id", parent.name: "article"}
| | | | | | | | # Node{name: "citation", count: 5249 (100%), valueCount: 5264 (100.3%), minLength: 1, maxLength: 443, xPath: "/drugbank/drug/enzymes/enzyme/references/articles/article/citation", parent.name: "article"}
| | | | | | # Node{name: "textbooks", count: 4280 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/references/textbooks", parent.name: "references"}
| | | | | | | # Node{name: "textbook", count: 7 (0.2%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/references/textbooks/textbook", parent.name: "textbooks"}
| | | | | | | | # Node{name: "citation", count: 7 (100%), valueCount: 11 (157.1%), minLength: 1, maxLength: 132, xPath: "/drugbank/drug/enzymes/enzyme/references/textbooks/textbook/citation", parent.name: "textbook"}
| | | | | | | | # Node{name: "isbn", count: 7 (100%), valueCount: 3 (42.9%), minLength: 10, maxLength: 17, xPath: "/drugbank/drug/enzymes/enzyme/references/textbooks/textbook/isbn", parent.name: "textbook"}
| | | | | # Node{name: "known-action", count: 4280 (100%), valueCount: 4280 (100%), minLength: 2, maxLength: 7, xPath: "/drugbank/drug/enzymes/enzyme/known-action", parent.name: "enzyme"}
| | | | | # Node{name: "induction-strength", count: 4280 (100%), valueCount: 4280 (100%), minLength: 4, maxLength: 8, xPath: "/drugbank/drug/enzymes/enzyme/induction-strength", parent.name: "enzyme"}
| | | | | # Node{name: "name", count: 4280 (100%), valueCount: 4289 (100.2%), minLength: 1, maxLength: 68, xPath: "/drugbank/drug/enzymes/enzyme/name", parent.name: "enzyme"}
| | | | | # Node{name: "id", count: 4280 (100%), valueCount: 4280 (100%), minLength: 9, maxLength: 9, xPath: "/drugbank/drug/enzymes/enzyme/id", parent.name: "enzyme"}
| | | | | # Node{name: "actions", count: 4280 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/enzymes/enzyme/actions", parent.name: "enzyme"}
| | | | | | # Node{name: "action", count: 4920 (115%), valueCount: 4920 (100%), minLength: 5, maxLength: 20, xPath: "/drugbank/drug/enzymes/enzyme/actions/action", parent.name: "actions"}
| | | # Node{name: "sequences", count: 1297 (11.8%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/sequences", parent.name: "drug"}
| | | | # Node{name: "sequence", count: 319 (24.6%), valueCount: 1530 (479.6%), minLength: 1, maxLength: 307, xPath: "/drugbank/drug/sequences/sequence", parent.name: "sequences"}
| | | | | * Attribute{name: "format", count: 319 (100%), valueCount: 319 (100%), minLength: 5, maxLength: 5, xPath: "/drugbank/drug/sequences/sequence/@format", parent.name: "sequence"}
| | | # Node{name: "targets", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets", parent.name: "drug"}
| | | | # Node{name: "target", count: 17736 (160.8%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target", parent.name: "targets"}
| | | | | * Attribute{name: "position", count: 10373 (58.5%), valueCount: 10373 (100%), minLength: 1, maxLength: 3, xPath: "/drugbank/drug/targets/target/@position", parent.name: "target"}
| | | | | # Node{name: "polypeptide", count: 18655 (105.2%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/polypeptide", parent.name: "target"}
| | | | | | * Attribute{name: "id", count: 18655 (100%), valueCount: 18655 (100%), minLength: 6, maxLength: 10, xPath: "/drugbank/drug/targets/target/polypeptide/@id", parent.name: "polypeptide"}
| | | | | | * Attribute{name: "source", count: 18655 (100%), valueCount: 18655 (100%), minLength: 6, maxLength: 10, xPath: "/drugbank/drug/targets/target/polypeptide/@source", parent.name: "polypeptide"}
| | | | | | # Node{name: "external-identifiers", count: 18655 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/polypeptide/external-identifiers", parent.name: "polypeptide"}
| | | | | | | # Node{name: "external-identifier", count: 109189 (585.3%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/polypeptide/external-identifiers/external-identifier", parent.name: "external-identifiers"}
| | | | | | | | # Node{name: "identifier", count: 109189 (100%), valueCount: 109189 (100%), minLength: 1, maxLength: 16, xPath: "/drugbank/drug/targets/target/polypeptide/external-identifiers/external-identifier/identifier", parent.name: "external-identifier"}
| | | | | | | | # Node{name: "resource", count: 109189 (100%), valueCount: 109189 (100%), minLength: 6, maxLength: 39, xPath: "/drugbank/drug/targets/target/polypeptide/external-identifiers/external-identifier/resource", parent.name: "external-identifier"}
| | | | | | # Node{name: "theoretical-pi", count: 18655 (100%), valueCount: 17345 (93%), minLength: 3, maxLength: 5, xPath: "/drugbank/drug/targets/target/polypeptide/theoretical-pi", parent.name: "polypeptide"}
| | | | | | # Node{name: "organism", count: 18655 (100%), valueCount: 18655 (100%), minLength: 3, maxLength: 145, xPath: "/drugbank/drug/targets/target/polypeptide/organism", parent.name: "polypeptide"}
| | | | | | | * Attribute{name: "ncbi-taxonomy-id", count: 18655 (100%), valueCount: 18655 (100%), minLength: 2, maxLength: 7, xPath: "/drugbank/drug/targets/target/polypeptide/organism/@ncbi-taxonomy-id", parent.name: "organism"}
| | | | | | # Node{name: "molecular-weight", count: 18655 (100%), valueCount: 18644 (99.9%), minLength: 6, maxLength: 10, xPath: "/drugbank/drug/targets/target/polypeptide/molecular-weight", parent.name: "polypeptide"}
| | | | | | # Node{name: "synonyms", count: 18655 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/polypeptide/synonyms", parent.name: "polypeptide"}
| | | | | | | # Node{name: "synonym", count: 74519 (399.5%), valueCount: 74543 (100%), minLength: 1, maxLength: 183, xPath: "/drugbank/drug/targets/target/polypeptide/synonyms/synonym", parent.name: "synonyms"}
| | | | | | # Node{name: "general-function", count: 18655 (100%), valueCount: 18090 (97%), minLength: 1, maxLength: 3009, xPath: "/drugbank/drug/targets/target/polypeptide/general-function", parent.name: "polypeptide"}
| | | | | | # Node{name: "pfams", count: 18655 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/polypeptide/pfams", parent.name: "polypeptide"}
| | | | | | | # Node{name: "pfam", count: 35135 (188.3%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/polypeptide/pfams/pfam", parent.name: "pfams"}
| | | | | | | | # Node{name: "identifier", count: 35135 (100%), valueCount: 35135 (100%), minLength: 7, maxLength: 7, xPath: "/drugbank/drug/targets/target/polypeptide/pfams/pfam/identifier", parent.name: "pfam"}
| | | | | | | | # Node{name: "name", count: 35135 (100%), valueCount: 35135 (100%), minLength: 2, maxLength: 15, xPath: "/drugbank/drug/targets/target/polypeptide/pfams/pfam/name", parent.name: "pfam"}
| | | | | | # Node{name: "gene-name", count: 18655 (100%), valueCount: 18014 (96.6%), minLength: 1, maxLength: 14, xPath: "/drugbank/drug/targets/target/polypeptide/gene-name", parent.name: "polypeptide"}
| | | | | | # Node{name: "amino-acid-sequence", count: 18655 (100%), valueCount: 125002 (670.1%), minLength: 1, maxLength: 192, xPath: "/drugbank/drug/targets/target/polypeptide/amino-acid-sequence", parent.name: "polypeptide"}
| | | | | | | * Attribute{name: "format", count: 18655 (100%), valueCount: 18655 (100%), minLength: 5, maxLength: 5, xPath: "/drugbank/drug/targets/target/polypeptide/amino-acid-sequence/@format", parent.name: "amino-acid-sequence"}
| | | | | | # Node{name: "specific-function", count: 18655 (100%), valueCount: 21734 (116.5%), minLength: 1, maxLength: 10641, xPath: "/drugbank/drug/targets/target/polypeptide/specific-function", parent.name: "polypeptide"}
| | | | | | # Node{name: "name", count: 18655 (100%), valueCount: 18684 (100.2%), minLength: 1, maxLength: 115, xPath: "/drugbank/drug/targets/target/polypeptide/name", parent.name: "polypeptide"}
| | | | | | # Node{name: "transmembrane-regions", count: 18655 (100%), valueCount: 23291 (124.9%), minLength: 3, maxLength: 19, xPath: "/drugbank/drug/targets/target/polypeptide/transmembrane-regions", parent.name: "polypeptide"}
| | | | | | # Node{name: "locus", count: 18655 (100%), valueCount: 13216 (70.8%), minLength: 1, maxLength: 28, xPath: "/drugbank/drug/targets/target/polypeptide/locus", parent.name: "polypeptide"}
| | | | | | # Node{name: "signal-regions", count: 18655 (100%), valueCount: 5564 (29.8%), minLength: 2, maxLength: 10, xPath: "/drugbank/drug/targets/target/polypeptide/signal-regions", parent.name: "polypeptide"}
| | | | | | # Node{name: "gene-sequence", count: 18655 (100%), valueCount: 289398 (1551.3%), minLength: 1, maxLength: 277, xPath: "/drugbank/drug/targets/target/polypeptide/gene-sequence", parent.name: "polypeptide"}
| | | | | | | * Attribute{name: "format", count: 18655 (100%), valueCount: 18655 (100%), minLength: 5, maxLength: 5, xPath: "/drugbank/drug/targets/target/polypeptide/gene-sequence/@format", parent.name: "gene-sequence"}
| | | | | | # Node{name: "go-classifiers", count: 18655 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/polypeptide/go-classifiers", parent.name: "polypeptide"}
| | | | | | | # Node{name: "go-classifier", count: 482328 (2585.5%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/polypeptide/go-classifiers/go-classifier", parent.name: "go-classifiers"}
| | | | | | | | # Node{name: "description", count: 482328 (100%), valueCount: 482580 (100.1%), minLength: 1, maxLength: 193, xPath: "/drugbank/drug/targets/target/polypeptide/go-classifiers/go-classifier/description", parent.name: "go-classifier"}
| | | | | | | | # Node{name: "category", count: 482328 (100%), valueCount: 482328 (100%), minLength: 7, maxLength: 9, xPath: "/drugbank/drug/targets/target/polypeptide/go-classifiers/go-classifier/category", parent.name: "go-classifier"}
| | | | | | # Node{name: "cellular-location", count: 18655 (100%), valueCount: 16221 (87%), minLength: 6, maxLength: 61, xPath: "/drugbank/drug/targets/target/polypeptide/cellular-location", parent.name: "polypeptide"}
| | | | | | # Node{name: "chromosome-location", count: 18655 (100%), valueCount: 13999 (75%), minLength: 1, maxLength: 4, xPath: "/drugbank/drug/targets/target/polypeptide/chromosome-location", parent.name: "polypeptide"}
| | | | | # Node{name: "organism", count: 17736 (100%), valueCount: 17723 (99.9%), minLength: 3, maxLength: 122, xPath: "/drugbank/drug/targets/target/organism", parent.name: "target"}
| | | | | # Node{name: "references", count: 17736 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/references", parent.name: "target"}
| | | | | | # Node{name: "links", count: 17736 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/references/links", parent.name: "references"}
| | | | | | | # Node{name: "link", count: 327 (1.8%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/references/links/link", parent.name: "links"}
| | | | | | | | # Node{name: "title", count: 327 (100%), valueCount: 327 (100%), minLength: 4, maxLength: 234, xPath: "/drugbank/drug/targets/target/references/links/link/title", parent.name: "link"}
| | | | | | | | # Node{name: "url", count: 327 (100%), valueCount: 353 (108%), minLength: 1, maxLength: 655, xPath: "/drugbank/drug/targets/target/references/links/link/url", parent.name: "link"}
| | | | | | # Node{name: "articles", count: 17736 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/references/articles", parent.name: "references"}
| | | | | | | # Node{name: "article", count: 33711 (190.1%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/references/articles/article", parent.name: "articles"}
| | | | | | | | # Node{name: "pubmed-id", count: 33711 (100%), valueCount: 33704 (100%), minLength: 5, maxLength: 8, xPath: "/drugbank/drug/targets/target/references/articles/article/pubmed-id", parent.name: "article"}
| | | | | | | | # Node{name: "citation", count: 33711 (100%), valueCount: 33794 (100.2%), minLength: 1, maxLength: 846, xPath: "/drugbank/drug/targets/target/references/articles/article/citation", parent.name: "article"}
| | | | | | # Node{name: "textbooks", count: 17736 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/references/textbooks", parent.name: "references"}
| | | | | | | # Node{name: "textbook", count: 94 (0.5%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/references/textbooks/textbook", parent.name: "textbooks"}
| | | | | | | | # Node{name: "citation", count: 94 (100%), valueCount: 108 (114.9%), minLength: 1, maxLength: 174, xPath: "/drugbank/drug/targets/target/references/textbooks/textbook/citation", parent.name: "textbook"}
| | | | | | | | # Node{name: "isbn", count: 94 (100%), valueCount: 67 (71.3%), minLength: 10, maxLength: 17, xPath: "/drugbank/drug/targets/target/references/textbooks/textbook/isbn", parent.name: "textbook"}
| | | | | # Node{name: "known-action", count: 17736 (100%), valueCount: 17736 (100%), minLength: 2, maxLength: 7, xPath: "/drugbank/drug/targets/target/known-action", parent.name: "target"}
| | | | | # Node{name: "name", count: 17736 (100%), valueCount: 17765 (100.2%), minLength: 1, maxLength: 115, xPath: "/drugbank/drug/targets/target/name", parent.name: "target"}
| | | | | # Node{name: "id", count: 17736 (100%), valueCount: 17736 (100%), minLength: 9, maxLength: 9, xPath: "/drugbank/drug/targets/target/id", parent.name: "target"}
| | | | | # Node{name: "actions", count: 17736 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/targets/target/actions", parent.name: "target"}
| | | | | | # Node{name: "action", count: 6812 (38.4%), valueCount: 6812 (100%), minLength: 5, maxLength: 38, xPath: "/drugbank/drug/targets/target/actions/action", parent.name: "actions"}
| | | # Node{name: "unii", count: 11033 (100%), valueCount: 6644 (60.2%), minLength: 10, maxLength: 10, xPath: "/drugbank/drug/unii", parent.name: "drug"}
| | | # Node{name: "protein-binding", count: 11033 (100%), valueCount: 1734 (15.7%), minLength: 1, maxLength: 675, xPath: "/drugbank/drug/protein-binding", parent.name: "drug"}
| | | # Node{name: "products", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/products", parent.name: "drug"}
| | | | # Node{name: "product", count: 255243 (2313.5%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/products/product", parent.name: "products"}
| | | | | # Node{name: "country", count: 255243 (100%), valueCount: 255243 (100%), minLength: 2, maxLength: 6, xPath: "/drugbank/drug/products/product/country", parent.name: "product"}
| | | | | # Node{name: "ema-ma-number", count: 255243 (100%), valueCount: 8712 (3.4%), minLength: 14, maxLength: 16, xPath: "/drugbank/drug/products/product/ema-ma-number", parent.name: "product"}
| | | | | # Node{name: "ema-product-code", count: 255243 (100%), valueCount: 8712 (3.4%), minLength: 15, maxLength: 15, xPath: "/drugbank/drug/products/product/ema-product-code", parent.name: "product"}
| | | | | # Node{name: "strength", count: 255243 (100%), valueCount: 126148 (49.4%), minLength: 1, maxLength: 36, xPath: "/drugbank/drug/products/product/strength", parent.name: "product"}
| | | | | # Node{name: "started-marketing-on", count: 255243 (100%), valueCount: 246133 (96.4%), minLength: 10, maxLength: 10, xPath: "/drugbank/drug/products/product/started-marketing-on", parent.name: "product"}
| | | | | # Node{name: "ended-marketing-on", count: 255243 (100%), valueCount: 64088 (25.1%), minLength: 10, maxLength: 10, xPath: "/drugbank/drug/products/product/ended-marketing-on", parent.name: "product"}
| | | | | # Node{name: "fda-application-number", count: 255243 (100%), valueCount: 170957 (67%), minLength: 2, maxLength: 11, xPath: "/drugbank/drug/products/product/fda-application-number", parent.name: "product"}
| | | | | # Node{name: "ndc-product-code", count: 255243 (100%), valueCount: 182726 (71.6%), minLength: 9, maxLength: 10, xPath: "/drugbank/drug/products/product/ndc-product-code", parent.name: "product"}
| | | | | # Node{name: "source", count: 255243 (100%), valueCount: 255243 (100%), minLength: 3, maxLength: 7, xPath: "/drugbank/drug/products/product/source", parent.name: "product"}
| | | | | # Node{name: "dpd-id", count: 255243 (100%), valueCount: 63805 (25%), minLength: 8, maxLength: 8, xPath: "/drugbank/drug/products/product/dpd-id", parent.name: "product"}
| | | | | # Node{name: "generic", count: 255243 (100%), valueCount: 255243 (100%), minLength: 4, maxLength: 5, xPath: "/drugbank/drug/products/product/generic", parent.name: "product"}
| | | | | # Node{name: "approved", count: 255243 (100%), valueCount: 255243 (100%), minLength: 4, maxLength: 5, xPath: "/drugbank/drug/products/product/approved", parent.name: "product"}
| | | | | # Node{name: "route", count: 255243 (100%), valueCount: 249965 (97.9%), minLength: 4, maxLength: 118, xPath: "/drugbank/drug/products/product/route", parent.name: "product"}
| | | | | # Node{name: "name", count: 255243 (100%), valueCount: 258981 (101.5%), minLength: 1, maxLength: 367, xPath: "/drugbank/drug/products/product/name", parent.name: "product"}
| | | | | # Node{name: "ndc-id", count: 255243 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/products/product/ndc-id", parent.name: "product"}
| | | | | # Node{name: "dosage-form", count: 255243 (100%), valueCount: 255180 (100%), minLength: 3, maxLength: 62, xPath: "/drugbank/drug/products/product/dosage-form", parent.name: "product"}
| | | | | # Node{name: "labeller", count: 255243 (100%), valueCount: 276745 (108.4%), minLength: 1, maxLength: 105, xPath: "/drugbank/drug/products/product/labeller", parent.name: "product"}
| | | | | # Node{name: "over-the-counter", count: 255243 (100%), valueCount: 255243 (100%), minLength: 4, maxLength: 5, xPath: "/drugbank/drug/products/product/over-the-counter", parent.name: "product"}
| | | # Node{name: "fda-label", count: 1212 (11%), valueCount: 1212 (100%), minLength: 71, maxLength: 71, xPath: "/drugbank/drug/fda-label", parent.name: "drug"}
| | | # Node{name: "clearance", count: 11033 (100%), valueCount: 1360 (12.3%), minLength: 1, maxLength: 1381, xPath: "/drugbank/drug/clearance", parent.name: "drug"}
| | | # Node{name: "atc-codes", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/atc-codes", parent.name: "drug"}
| | | | # Node{name: "atc-code", count: 3987 (36.1%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/atc-codes/atc-code", parent.name: "atc-codes"}
| | | | | * Attribute{name: "code", count: 3987 (100%), valueCount: 3987 (100%), minLength: 7, maxLength: 7, xPath: "/drugbank/drug/atc-codes/atc-code/@code", parent.name: "atc-code"}
| | | | | # Node{name: "level", count: 15948 (400%), valueCount: 15948 (100%), minLength: 4, maxLength: 92, xPath: "/drugbank/drug/atc-codes/atc-code/level", parent.name: "atc-code"}
| | | | | | * Attribute{name: "code", count: 15948 (100%), valueCount: 15948 (100%), minLength: 1, maxLength: 5, xPath: "/drugbank/drug/atc-codes/atc-code/level/@code", parent.name: "level"}
| | | # Node{name: "patents", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/patents", parent.name: "drug"}
| | | | # Node{name: "patent", count: 6836 (62%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/patents/patent", parent.name: "patents"}
| | | | | # Node{name: "number", count: 6836 (100%), valueCount: 6836 (100%), minLength: 5, maxLength: 12, xPath: "/drugbank/drug/patents/patent/number", parent.name: "patent"}
| | | | | # Node{name: "country", count: 6836 (100%), valueCount: 6836 (100%), minLength: 6, maxLength: 13, xPath: "/drugbank/drug/patents/patent/country", parent.name: "patent"}
| | | | | # Node{name: "approved", count: 6836 (100%), valueCount: 6836 (100%), minLength: 10, maxLength: 10, xPath: "/drugbank/drug/patents/patent/approved", parent.name: "patent"}
| | | | | # Node{name: "expires", count: 6836 (100%), valueCount: 6836 (100%), minLength: 10, maxLength: 10, xPath: "/drugbank/drug/patents/patent/expires", parent.name: "patent"}
| | | | | # Node{name: "pediatric-extension", count: 6836 (100%), valueCount: 6836 (100%), minLength: 4, maxLength: 5, xPath: "/drugbank/drug/patents/patent/pediatric-extension", parent.name: "patent"}
| | | # Node{name: "categories", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/categories", parent.name: "drug"}
| | | | # Node{name: "category", count: 80908 (733.3%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/categories/category", parent.name: "categories"}
| | | | | # Node{name: "category", count: 80908 (100%), valueCount: 81603 (100.9%), minLength: 1, maxLength: 92, xPath: "/drugbank/drug/categories/category/category", parent.name: "category"}
| | | | | # Node{name: "mesh-id", count: 80908 (100%), valueCount: 68259 (84.4%), minLength: 7, maxLength: 10, xPath: "/drugbank/drug/categories/category/mesh-id", parent.name: "category"}
| | | # Node{name: "prices", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/prices", parent.name: "drug"}
| | | | # Node{name: "price", count: 11810 (107%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/prices/price", parent.name: "prices"}
| | | | | # Node{name: "unit", count: 11810 (100%), valueCount: 11810 (100%), minLength: 1, maxLength: 20, xPath: "/drugbank/drug/prices/price/unit", parent.name: "price"}
| | | | | # Node{name: "cost", count: 11810 (100%), valueCount: 11810 (100%), minLength: 3, maxLength: 8, xPath: "/drugbank/drug/prices/price/cost", parent.name: "price"}
| | | | | | * Attribute{name: "currency", count: 11810 (100%), valueCount: 11810 (100%), minLength: 3, maxLength: 3, xPath: "/drugbank/drug/prices/price/cost/@currency", parent.name: "cost"}
| | | | | # Node{name: "description", count: 11810 (100%), valueCount: 11872 (100.5%), minLength: 1, maxLength: 84, xPath: "/drugbank/drug/prices/price/description", parent.name: "price"}
| | | # Node{name: "salts", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/salts", parent.name: "drug"}
| | | | # Node{name: "salt", count: 2104 (19.1%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/salts/salt", parent.name: "salts"}
| | | | | # Node{name: "inchikey", count: 2104 (100%), valueCount: 1878 (89.3%), minLength: 27, maxLength: 27, xPath: "/drugbank/drug/salts/salt/inchikey", parent.name: "salt"}
| | | | | # Node{name: "average-mass", count: 1876 (89.2%), valueCount: 1876 (100%), minLength: 4, maxLength: 9, xPath: "/drugbank/drug/salts/salt/average-mass", parent.name: "salt"}
| | | | | # Node{name: "name", count: 2104 (100%), valueCount: 2104 (100%), minLength: 4, maxLength: 67, xPath: "/drugbank/drug/salts/salt/name", parent.name: "salt"}
| | | | | # Node{name: "cas-number", count: 2104 (100%), valueCount: 1925 (91.5%), minLength: 7, maxLength: 12, xPath: "/drugbank/drug/salts/salt/cas-number", parent.name: "salt"}
| | | | | # Node{name: "drugbank-id", count: 2104 (100%), valueCount: 2104 (100%), minLength: 12, maxLength: 12, xPath: "/drugbank/drug/salts/salt/drugbank-id", parent.name: "salt"}
| | | | | | * Attribute{name: "primary", count: 2104 (100%), valueCount: 2104 (100%), minLength: 4, maxLength: 4, xPath: "/drugbank/drug/salts/salt/drugbank-id/@primary", parent.name: "drugbank-id"}
| | | | | # Node{name: "unii", count: 2104 (100%), valueCount: 1995 (94.8%), minLength: 10, maxLength: 10, xPath: "/drugbank/drug/salts/salt/unii", parent.name: "salt"}
| | | | | # Node{name: "monoisotopic-mass", count: 1876 (89.2%), valueCount: 1876 (100%), minLength: 6, maxLength: 14, xPath: "/drugbank/drug/salts/salt/monoisotopic-mass", parent.name: "salt"}
| | | # Node{name: "manufacturers", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/manufacturers", parent.name: "drug"}
| | | | # Node{name: "manufacturer", count: 5979 (54.2%), valueCount: 5985 (100.1%), minLength: 1, maxLength: 78, xPath: "/drugbank/drug/manufacturers/manufacturer", parent.name: "manufacturers"}
| | | | | * Attribute{name: "generic", count: 5979 (100%), valueCount: 5979 (100%), minLength: 4, maxLength: 5, xPath: "/drugbank/drug/manufacturers/manufacturer/@generic", parent.name: "manufacturer"}
| | | | | * Attribute{name: "url", count: 5979 (100%), valueCount: 19 (0.3%), minLength: 22, maxLength: 22, xPath: "/drugbank/drug/manufacturers/manufacturer/@url", parent.name: "manufacturer"}
| | | # Node{name: "drug-interactions", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/drug-interactions", parent.name: "drug"}
| | | | # Node{name: "drug-interaction", count: 694128 (6291.4%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/drug-interactions/drug-interaction", parent.name: "drug-interactions"}
| | | | | # Node{name: "name", count: 694128 (100%), valueCount: 694128 (100%), minLength: 4, maxLength: 80, xPath: "/drugbank/drug/drug-interactions/drug-interaction/name", parent.name: "drug-interaction"}
| | | | | # Node{name: "description", count: 694128 (100%), valueCount: 694128 (100%), minLength: 52, maxLength: 198, xPath: "/drugbank/drug/drug-interactions/drug-interaction/description", parent.name: "drug-interaction"}
| | | | | # Node{name: "drugbank-id", count: 694128 (100%), valueCount: 694128 (100%), minLength: 7, maxLength: 7, xPath: "/drugbank/drug/drug-interactions/drug-interaction/drugbank-id", parent.name: "drug-interaction"}
| | | # Node{name: "groups", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/groups", parent.name: "drug"}
| | | | # Node{name: "group", count: 13224 (119.9%), valueCount: 13224 (100%), minLength: 7, maxLength: 15, xPath: "/drugbank/drug/groups/group", parent.name: "groups"}
| | | # Node{name: "packagers", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/packagers", parent.name: "drug"}
| | | | # Node{name: "packager", count: 20558 (186.3%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/packagers/packager", parent.name: "packagers"}
| | | | | # Node{name: "name", count: 20558 (100%), valueCount: 20916 (101.7%), minLength: 1, maxLength: 58, xPath: "/drugbank/drug/packagers/packager/name", parent.name: "packager"}
| | | | | # Node{name: "url", count: 20558 (100%), valueCount: 15345 (74.6%), minLength: 17, maxLength: 52, xPath: "/drugbank/drug/packagers/packager/url", parent.name: "packager"}
| | | # Node{name: "international-brands", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/international-brands", parent.name: "drug"}
| | | | # Node{name: "international-brand", count: 8776 (79.5%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/international-brands/international-brand", parent.name: "international-brands"}
| | | | | # Node{name: "name", count: 8776 (100%), valueCount: 8780 (100%), minLength: 1, maxLength: 52, xPath: "/drugbank/drug/international-brands/international-brand/name", parent.name: "international-brand"}
| | | | | # Node{name: "company", count: 8776 (100%), valueCount: 5094 (58%), minLength: 1, maxLength: 233, xPath: "/drugbank/drug/international-brands/international-brand/company", parent.name: "international-brand"}
| | | # Node{name: "reactions", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/reactions", parent.name: "drug"}
| | | | # Node{name: "reaction", count: 2108 (19.1%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/reactions/reaction", parent.name: "reactions"}
| | | | | # Node{name: "sequence", count: 2108 (100%), valueCount: 2108 (100%), minLength: 1, maxLength: 1, xPath: "/drugbank/drug/reactions/reaction/sequence", parent.name: "reaction"}
| | | | | # Node{name: "right-element", count: 2108 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/reactions/reaction/right-element", parent.name: "reaction"}
| | | | | | # Node{name: "name", count: 2108 (100%), valueCount: 2119 (100.5%), minLength: 2, maxLength: 122, xPath: "/drugbank/drug/reactions/reaction/right-element/name", parent.name: "right-element"}
| | | | | | # Node{name: "drugbank-id", count: 2108 (100%), valueCount: 2108 (100%), minLength: 7, maxLength: 10, xPath: "/drugbank/drug/reactions/reaction/right-element/drugbank-id", parent.name: "right-element"}
| | | | | # Node{name: "enzymes", count: 2108 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/reactions/reaction/enzymes", parent.name: "reaction"}
| | | | | | # Node{name: "enzyme", count: 2336 (110.8%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/reactions/reaction/enzymes/enzyme", parent.name: "enzymes"}
| | | | | | | # Node{name: "uniprot-id", count: 2336 (100%), valueCount: 2287 (97.9%), minLength: 6, maxLength: 6, xPath: "/drugbank/drug/reactions/reaction/enzymes/enzyme/uniprot-id", parent.name: "enzyme"}
| | | | | | | # Node{name: "name", count: 2336 (100%), valueCount: 2338 (100.1%), minLength: 1, maxLength: 68, xPath: "/drugbank/drug/reactions/reaction/enzymes/enzyme/name", parent.name: "enzyme"}
| | | | | | | # Node{name: "drugbank-id", count: 2336 (100%), valueCount: 2336 (100%), minLength: 9, maxLength: 9, xPath: "/drugbank/drug/reactions/reaction/enzymes/enzyme/drugbank-id", parent.name: "enzyme"}
| | | | | # Node{name: "left-element", count: 2108 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/reactions/reaction/left-element", parent.name: "reaction"}
| | | | | | # Node{name: "name", count: 2108 (100%), valueCount: 2108 (100%), minLength: 2, maxLength: 61, xPath: "/drugbank/drug/reactions/reaction/left-element/name", parent.name: "left-element"}
| | | | | | # Node{name: "drugbank-id", count: 2108 (100%), valueCount: 2108 (100%), minLength: 7, maxLength: 10, xPath: "/drugbank/drug/reactions/reaction/left-element/drugbank-id", parent.name: "left-element"}
| | | # Node{name: "ahfs-codes", count: 11033 (100%), valueCount: 0 (0%), minLength: N/A, maxLength: N/A, xPath: "/drugbank/drug/ahfs-codes", parent.name: "drug"}
| | | | # Node{name: "ahfs-code", count: 1606 (14.6%), valueCount: 1606 (100%), minLength: 8, maxLength: 11, xPath: "/drugbank/drug/ahfs-codes/ahfs-code", parent.name: "ahfs-codes"}
| | | # Node{name: "drugbank-id", count: 15850 (143.7%), valueCount: 15850 (100%), minLength: 7, maxLength: 12, xPath: "/drugbank/drug/drugbank-id", parent.name: "drug"}
| | | | * Attribute{name: "primary", count: 11033 (69.6%), valueCount: 11033 (100%), minLength: 4, maxLength: 4, xPath: "/drugbank/drug/drugbank-id/@primary", parent.name: "drugbank-id"}
 ```
