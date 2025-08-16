const fs = require('fs');

class SimpleCodeFormatter {
    constructor(filePath) {
        this.filePath = filePath;
    }

    format() {
        const code = fs.readFileSync(this.filePath, 'utf8');
        const formattedCode = this.applyFormatting(code);
        fs.writeFileSync(this.filePath, formattedCode);
    }

    applyFormatting(code) {
        // Implement simple formatting logic here
        return code.trim(); // Example: just trims whitespace
    }
}

if (process.argv.length !== 3) {
    console.error('Usage: node formatter.js <file_path>');
    process.exit(1);
}
const filePath = process.argv[2];
const formatter = new SimpleCodeFormatter(filePath);
formatter.format();