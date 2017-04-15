var kotlin = require("node-kotlin");

kotlin({
    src: 'src/**/*.kt',
    out: "out", // default: "out"
    exportKotlinJs: true, // default: false
    moduleName: "myApp", // default: "app"
    sourceMaps: true, // default: false
    verbose: true, // default: false
    metaInfo: false // default: true
});