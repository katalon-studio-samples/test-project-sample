import katalon from "katalon";

export default katalon.testCase("New Test Case", async ({ local, web }) => {
  await new Promise((r) => setTimeout(r, 0));
  await web.openBrowser("https://katalon-demo-cura.herokuapp.com");
  await web.click({
    type: "Web",
    id: "5feaa9e7-45f8-4d9d-9d98-e9ee3b2601c6",
    attributes: {
      id: "btn-make-appointment",
      href: "./index.php#appointment",
      class: "btn btn-dark btn-lg",
    },
    childIndex: 4,
    hashes: { "md5.v1": "3caec008087ccb7a1cb3fc698fbf83c2" },
    name: "a - Make Appointment",
    selectors: [
      {
        id: "b2401921-2f8e-4209-bda6-c2d0639b2e05",
        type: "CSS",
        value: "#btn-make-appointment",
        isDefault: true,
      },
      {
        id: "5aa3239f-798a-448d-8fdb-0cba732500b9",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "a",
    text: "Make Appointment",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "b7d9b2d0-ea63-4eb2-a767-b7c59491552b",
    attributes: {
      type: "text",
      class: "form-control",
      id: "txt_visit_date",
      name: "visit_date",
      placeholder: "dd/mm/yyyy",
      autocomplete: "off",
      required: "",
    },
    childIndex: 1,
    hashes: { "md5.v1": "055cc9a2ee5ca19d0a879ebe370aa30e" },
    name: "input - dd/mm/yyyy",
    selectors: [
      {
        id: "10b3bf27-6852-4261-91ee-9ad8e799523a",
        type: "CSS",
        value: "#txt_visit_date",
        isDefault: true,
      },
      {
        id: "7c25f8f8-ed08-4e51-906b-2ed48bf7b5f9",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "input",
    text: "",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "89aefbfc-ccae-4cc6-9f81-86759ecc2c12",
    attributes: { class: "day" },
    childIndex: 2,
    hashes: { "md5.v1": "7b081d928af41a017fa795f3878b6479" },
    name: "td - 15",
    selectors: [
      {
        id: "3b63f5d6-0eb7-4be4-a3b3-8cdd50f88d17",
        type: "CSS",
        value: "tr:nth-child(3) .day:nth-child(2)",
        isDefault: true,
      },
      {
        id: "84b25677-5ab3-46e1-b2bd-62d32bc8d7a5",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "td",
    text: "15",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "b4b96d62-cc3f-4a45-994d-9352b5f98ac9",
    attributes: {
      class: "form-control",
      id: "txt_comment",
      name: "comment",
      placeholder: "Comment",
      rows: "10",
    },
    childIndex: 1,
    hashes: { "md5.v1": "b06c3c43a662648630c6cc9a9b0663f1" },
    name: "textarea - Comment",
    selectors: [
      {
        id: "0c9985d3-dc89-4140-ade3-853ceb9ed92a",
        type: "CSS",
        value: "#txt_comment",
        isDefault: true,
      },
      {
        id: "8bc6457b-e087-4f7b-9502-c7e5a3c229ac",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "textarea",
    text: "",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "97adece8-7557-4275-a914-021f0eacf0c7",
    attributes: {
      id: "btn-book-appointment",
      type: "submit",
      class: "btn btn-default",
    },
    childIndex: 1,
    hashes: { "md5.v1": "56ef00cb92ad0547b9464c968fd02681" },
    name: "button - Book Appointment",
    selectors: [
      {
        id: "98cc2e0d-8de9-497e-8af1-029e0d90cc1b",
        type: "CSS",
        value: "#btn-book-appointment",
        isDefault: true,
      },
      {
        id: "90889ee0-b946-424c-b8a2-b022b671669b",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "button",
    text: "Book Appointment",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/",
    parentIframe: null,
    shadowRoot: null,
  });
  await web.click({
    type: "Web",
    id: "cc2e73c2-eba0-4b81-891e-5fb66dc39830",
    attributes: {
      class: "btn btn-default",
      href: "https://katalon-demo-cura.herokuapp.com/",
    },
    childIndex: 1,
    hashes: { "md5.v1": "706652890bf1fc29e80d791a1c2f601a" },
    name: "a - Go to Homepage",
    selectors: [
      {
        id: "511d3062-57ca-4d6c-a9db-eb5bb1975774",
        type: "CSS",
        value: ".btn.btn-default",
        isDefault: true,
      },
      {
        id: "59ac0e4f-9202-4113-8a40-03dc5477f051",
        type: "Attribute",
        value: null,
        isDefault: true,
      },
    ],
    selectorType: "CSS",
    tag: "a",
    text: "Go to Homepage",
    pageUrl: "https://katalon-demo-cura.herokuapp.com/appointment.php#summary",
    parentIframe: null,
    shadowRoot: null,
  });
});